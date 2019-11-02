package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperABDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperIdDto;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestPaperService;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperDetailService;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ExcelUtil;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION:
 **/
@Api(tags = "TestPaperController")
@RestController
@RequestMapping("/api/test_paper")
public class TestPaperController {

    @Autowired
    private TestPaperService testPaperService;

    @Autowired
    private TestPaperDetailService testPaperDetailService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentTestPaperService studentTestPaperService;

    @ApiOperation("添加试卷")
    @PostMapping("/add")
    public ResultVO addTestPaper(@RequestBody TestPaperDTO testPaperDTO) {
        Boolean addResult = testPaperService.addTestPaper(testPaperDTO);
        if (addResult) {
            return ResultVOUtil.success();
        } else {
            return ResultVOUtil.error(ResultEnum.ADD_TEST_PAPER_FAIL.getCode(), ResultEnum.ADD_TEST_PAPER_DETAIL_FAIL.getMessage());
        }

    }

    @ApiOperation("试卷列表")
    @GetMapping("/list")
    public ResultVO TestPaperPage(@RequestParam(value = "page") int page,
                                  @RequestParam(value = "pageSize") int pageSize,
                                  @RequestParam(value = "classroomId") Integer classroomId) {
        PageRequest request = PageRequest.of(page-1, pageSize);
        Map testList = testPaperService.TestPaperPage(classroomId, request);
        return ResultVOUtil.success(testList);
    }

    @ApiOperation("试卷删除")
    @DeleteMapping("/remove")
    public ResultVO removeTestPaper(@RequestParam(value = "testPaperId") Integer testPaperId) {
        testPaperService.remove(testPaperId);
        return ResultVOUtil.success();
    }

    @ApiOperation("试卷编辑")
    @PutMapping("/edit")
    public ResultVO editTestPaper(@RequestBody TestPaperDTO testPaperDTO) {
        Boolean result = testPaperService.editTestPaper(testPaperDTO);
        if (result) {
            return ResultVOUtil.success();
        } else {
            return ResultVOUtil.error(ResultEnum.EDIT_TEST_PAPER_FAIL.getCode(), ResultEnum.EDIT_TEST_PAPER_FAIL.getMessage());
        }
    }

    /**
     * 布置考试
     */
    @ApiOperation("布置考试")
    @PutMapping("/examined")
    public ResultVO examined(Integer userId, Integer status, Integer id) {
        boolean flag = testPaperService.examined(userId, status, id);
        if (flag) {
            return ResultVOUtil.success();
        } else
            return ResultVOUtil.error(400, "布置失败");
    }

    /**
     * 撤销考试
     */
    @ApiOperation("撤销考试")
    @PutMapping("/revokeExamined")
    public ResultVO revokeExamined(Integer userId, Integer status, Integer id) {
        boolean flag = testPaperService.revokeExamined(userId, status, id);
        if (flag) {
            return ResultVOUtil.success();
        } else
            return ResultVOUtil.error(400, "撤销失败");
    }

    /**
     * @Method getTemplate
     * @Author YuJunMing
     * @Date 2019/10/24 23:27
     */
    @ApiOperation("下载成绩模板")
    @RequestMapping("/getTemplate")
    public void getTemplate(@RequestBody TestPaperIdDto testPaperIdDto, HttpServletResponse response) throws IOException {

        Integer testPaperType = testPaperService.selectByPrimaryKey(testPaperIdDto.getTestPaperId()).getTestPaperType();
        System.out.println(testPaperType);
        List<List<String>> excelData = new ArrayList<>();
        List<String> head = new ArrayList<>();

        if (testPaperType == 1) {
            head.add("学号");
            head.add("姓名");
            head.add("总分");
        } else if (testPaperType == 2) {
            head.add("学号");
            head.add("姓名");
            head.add("总分");
            head.add("试卷类型");
        }

        int tmp = testPaperDetailService.getQuestionsNumber(testPaperIdDto.getTestPaperId());
        for (int i = 0; i < tmp; i++) {
            head.add("第" + (i + 1) + "题");
        }

        excelData.add(head);

        String sheetName = "成绩";
        String fileName = new String("成绩导入模板.xls".getBytes("GBK"), "ISO-8859-1");
        ExcelUtil.exportExcel(response, excelData, sheetName, fileName, 15);
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/25 7:45
     * DESCRIPTION:
     */
    @RequestMapping(value = "/import", method = RequestMethod.POST)
    public ResultVO importResult(@RequestParam("file") MultipartFile file, @RequestParam(value = "testPaperId") Integer testPaperId, HttpServletRequest request) throws Exception {

        System.out.println(testPaperId.getClass());
        /**找出教师**/
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fileName = file.getOriginalFilename();
        /**通过token找到教师**/
        String token = request.getHeader("Authorization");
        Integer teacherId = teacherService.getTeacherIdByToken(token);
        //判断版本
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }
        InputStream is = file.getInputStream();
        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);

        System.out.println("行数" + sheet.getLastRowNum());//获取行数

        TestPaperIdDto testPaperIdDto = new TestPaperIdDto();
        testPaperIdDto.setTestPaperId(testPaperId);
        int questionsNumber = testPaperDetailService.getQuestionsNumber(testPaperIdDto.getTestPaperId());   //获取题目数量
        Integer testPaperType = testPaperService.selectByPrimaryKey(testPaperIdDto.getTestPaperId()).getTestPaperType();//试卷类型
        System.out.println(testPaperType + "类型");
        List<TestPaperIdDto> testPaperIdDtoList = new LinkedList<>();

        List<TestPaperDetail> testPaperDetailListA = new LinkedList<>();
        List<TestPaperDetail> testPaperDetailListB = new LinkedList<>();

        /** 里面下题号的顺序 **/
        if (testPaperType == 1) {
            testPaperDetailListA = testPaperDetailService.getTestPaperDetailOrder(1, testPaperId);
        } else if (testPaperType == 2) {
            testPaperDetailListA = testPaperDetailService.getTestPaperDetailOrder(1, testPaperId);
            testPaperDetailListB = testPaperDetailService.getTestPaperDetailOrder(2, testPaperId);
        }
        System.out.println("-================================================================");
        for (int i = 0; i < testPaperDetailListB.size(); i++) {
            System.out.println(testPaperDetailListB.get(i));
        }
        if (testPaperType == 1) {
            for (int r = 1; r < sheet.getLastRowNum() + 1; r++) {  //对每一行进行增加
                Row row = sheet.getRow(r);
                if (row != null) {
                    String classRoomStudentId = ExcelUtil.isNull(row.getCell(1).toString());

                    for (int i = 2 + testPaperType; i < 2 + testPaperType + questionsNumber; i++) {

                        TestPaperIdDto testPaperIdDto1 = new TestPaperIdDto();
                        testPaperIdDto1.setCreatedBy(new Date());
                        testPaperIdDto1.setCreatBy(teacherId);
                        testPaperIdDto1.setTestPaperId(testPaperDetailListA.get(i - 2 - testPaperType).getId());
                        testPaperIdDto1.setClassRoomStudentId((int) Float.parseFloat(classRoomStudentId));
                        String rowGetCell = null;
                        if (row.getCell(i) != null) {
                            rowGetCell = row.getCell(i).toString();
                        } else {
                            rowGetCell = "0.0";
                        }
                        testPaperIdDto1.setScore(Float.parseFloat(rowGetCell));
                        testPaperIdDtoList.add(testPaperIdDto1);


                    }
                }
            }
        } else if (testPaperType == 2) {
            for (int r = 1; r < sheet.getLastRowNum() + 1; r++) {  //对每一行进行增加
                Row row = sheet.getRow(r);
                if (row != null) {
                    String classRoomStudentId = ExcelUtil.isNull(row.getCell(1).toString());
                    System.out.println("================================================================");
                    System.out.println(row.getCell(3).toString());
                    if (row.getCell(3).toString().equals("1.0") || row.getCell(3).toString().equals("A") || row.getCell(3).toString().equals("a")) {
                        for (int i = 2 + testPaperType; i < 2 + testPaperType + questionsNumber; i++) {

                            TestPaperIdDto testPaperIdDto1 = new TestPaperIdDto();
                            testPaperIdDto1.setCreatedBy(new Date());
                            testPaperIdDto1.setCreatBy(teacherId);
                            testPaperIdDto1.setTestPaperId(testPaperDetailListA.get(i - 2 - testPaperType).getId());
                            testPaperIdDto1.setClassRoomStudentId((int) Float.parseFloat(classRoomStudentId));
                            String rowGetCell = null;
                            if (row.getCell(i) != null) {
                                rowGetCell = row.getCell(i).toString();
                            } else {
                                rowGetCell = "0.0";
                            }
                            testPaperIdDto1.setScore(Float.parseFloat(rowGetCell));
                            testPaperIdDtoList.add(testPaperIdDto1);
                        }

                    } else {
                        for (int i = 2 + testPaperType; i < 2 + testPaperType + questionsNumber; i++) {

                            TestPaperIdDto testPaperIdDto1 = new TestPaperIdDto();
                            testPaperIdDto1.setCreatedBy(new Date());
                            testPaperIdDto1.setCreatBy(teacherId);
                            testPaperIdDto1.setTestPaperId(testPaperDetailListB.get(i - 2 - testPaperType).getId());
                            testPaperIdDto1.setClassRoomStudentId((int) Float.parseFloat(classRoomStudentId));
                            String rowGetCell = null;
                            if (row.getCell(i) != null) {
                                rowGetCell = row.getCell(i).toString();
                            } else {
                                rowGetCell = "0.0";
                            }
                            testPaperIdDto1.setScore(Float.parseFloat(rowGetCell));
                            testPaperIdDtoList.add(testPaperIdDto1);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < testPaperIdDtoList.size(); i++) {

            System.out.print("学生" + testPaperIdDtoList.get(i).getClassRoomStudentId() + "  ");
            System.out.print("成绩" + testPaperIdDtoList.get(i).getScore() + "  ");
            System.out.print("题号" + testPaperIdDtoList.get(i).getTestPaperId() + "  ");
            System.out.print("创建人" + testPaperIdDtoList.get(i).getCreatBy() + "  ");
            System.out.print("创建时间" + dateFormat.format(testPaperIdDtoList.get(i).getCreatedBy()) + "  ");
            System.out.println(" ");
        }


        return ResultVOUtil.success(studentTestPaperService.insertStudentTestPaper(testPaperIdDtoList));
    }
}
