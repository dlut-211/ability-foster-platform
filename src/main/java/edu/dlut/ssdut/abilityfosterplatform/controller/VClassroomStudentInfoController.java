package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.VCharterWorkDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkChapterDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkInfoDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomStudentInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import edu.dlut.ssdut.abilityfosterplatform.service.*;
import edu.dlut.ssdut.abilityfosterplatform.utils.ExcelUtil;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Api(tags = "VClassroomStudentInfoController")
@RestController
@RequestMapping("/api/classroomstudent")
public class VClassroomStudentInfoController {

    @Autowired
    private VClassroomStudentInfoService vClassroomStudentInfoService;

    @Autowired
    private VChapterWorkService vChapterWorkService;

    @Autowired
    private TeacherService teacherService;

    @Resource
    private ResourceLoader resourceLoader;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassroomStudentService classroomStudentService;

    @ApiOperation("学生首页——通过学生Id获取所选课程信息")
    @GetMapping("/selectClassRoomCountById")
    public ResultVO VStudentWorkInfoPage(VStudentWorkInfoDto vStudentWorkInfoDto){
        PageRequest request=PageRequest.of(vStudentWorkInfoDto.getNowPage()-1,
                vStudentWorkInfoDto.getPageSize(),
                Sort.Direction.DESC,"begin_date");
        Page<VClassroomStudentInfo> page = vClassroomStudentInfoService.VStudentWorkInfoPage(vStudentWorkInfoDto.getStudentId(),request);
        return ResultVOUtil.success(page);
    }

    @ApiOperation("学生页面—我的课堂—章节作业")
    @GetMapping("/chapterWorkList")
    public ResultVO VChapterWorkPage(VCharterWorkDto vCharterWorkDto){
        PageRequest request = PageRequest.of(vCharterWorkDto.getNowPage()-1,vCharterWorkDto.getPageSize());
        int startSize=(vCharterWorkDto.getNowPage()-1)*vCharterWorkDto.getPageSize();
        List<VChapterWorkZjk> page = vChapterWorkService.VChapterWorkPage(vCharterWorkDto.getClassroomId(),vCharterWorkDto.getStudentId(),
                startSize,vCharterWorkDto.getPageSize());
        List<VChapterWorkZjk> page1 = vChapterWorkService.VChapterWorkPage(vCharterWorkDto.getClassroomId(),vCharterWorkDto.getStudentId(),
                0,99999);
        Map<String,Object>map=new HashMap<>();
        map.put("content", page);
        map.put("totalRecode", page1.size());
        return ResultVOUtil.success(map);
    }

    @ApiOperation("学生页面—查看作业")
    @GetMapping("/studentworkbychapter")
    public ResultVO findVStudentWorkChapters(VStudentWorkChapterDto vStudentWorkChapterDto){
        PageRequest request = PageRequest.of(vStudentWorkChapterDto.getNowPage()-1,vStudentWorkChapterDto.getPageSize());
        Page<VStudentWorkChapter> page = vChapterWorkService.VStudentWorkChapterPage(vStudentWorkChapterDto.getStudentId(),
                vStudentWorkChapterDto.getChapterId(),vStudentWorkChapterDto.getClassroomId(),request);
        return ResultVOUtil.success(page);
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/25 20:16
     * DESCRIPTION:下载导入学生的模板
     */
    @ApiOperation("下载学生模板")
    @RequestMapping("/gettemplate")
    public void getTemplate(HttpServletResponse response, HttpServletRequest request) throws IOException {
        List<List<String>> excelData = new ArrayList<>();
        List<String> head = new ArrayList<>();
        head.add("学号");
        head.add("学生姓名");
        head.add("学校");
        head.add("班级");
        head.add("邮箱");
        head.add("手机号");
        excelData.add(head);
        String sheetName = "学生列表";
        String fileName = new String("学生导入模板.xls".getBytes("GBK"), "ISO-8859-1");
        ExcelUtil.exportExcel(response, excelData, sheetName, fileName, 15);
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/25 20:51
     * DESCRIPTION: 导入学生
     */
    @ApiOperation("导入学生")
    @PostMapping("/importstu")
    public ResultVO importResult(@RequestParam("file") MultipartFile file, @RequestParam(value = "filesname") String filesname, @RequestParam(value = "classRoomId") Integer classRoomId, HttpServletRequest request) throws Exception {
        String fileName = file.getOriginalFilename();
        String token = request.getHeader("Authorization");
        Integer teacherId=teacherService.getTeacherIdByToken(token);
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
        List<InsertStudentDTO> insertStudentDTOList = new LinkedList<>();
        for (int r = 1; r < sheet.getLastRowNum() + 1; r++) {  //对每一行进行增加
            Row row = sheet.getRow(r);
            if (row != null) {
                InsertStudentDTO insertStudentDTO = new InsertStudentDTO();

                insertStudentDTO.setStudentId(Integer.parseInt(this.getStringInExcel(row.getCell(0))));
                insertStudentDTO.setName(this.getStringInExcel(row.getCell(1)));
                insertStudentDTO.setSchool(ExcelUtil.isNull(this.getStringInExcel(row.getCell(2))));
                insertStudentDTO.setClassName(this.getStringInExcel(row.getCell(3)));
                insertStudentDTO.setEmail((this.getStringInExcel(row.getCell(4))));
                insertStudentDTO.setMobile(this.getStringInExcel(row.getCell(5)));

                insertStudentDTO.setStatus(0);
                insertStudentDTO.setClassroomId(classRoomId);
                insertStudentDTO.setCreatedBy(teacherId);
                insertStudentDTO.setCreatOn(new Date());
                insertStudentDTOList.add(insertStudentDTO);
            }
        }
        for (int i=0;i<insertStudentDTOList.size();i++){
            System.out.println(insertStudentDTOList.get(i));
        }
        System.out.println(insertStudentDTOList.size());
        return ResultVOUtil.success(studentService.insertStudentList(insertStudentDTOList));
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 8:51
     * DESCRIPTION: 查看课堂学生（带分页和模糊查询）
     */
    @ApiOperation("查看课堂学生")
    @GetMapping("/list")
    public ResultVO list(@RequestParam(value = "ClassRoomId", required = false, defaultValue = "") Integer classRoomId,
                         @RequestParam(value = "StudentNumber", required = false, defaultValue = "") String studentNumber,
                         @RequestParam(value = "StudentName", required = false, defaultValue = "") String studentName,
                         @RequestParam(value = "StudentSchool", required = false, defaultValue = "") String studentSchool,
                         @RequestParam(value = "StudentClassName", required = false, defaultValue = "") String studentClassName,
                         @RequestParam(name = "page", defaultValue = "1") int page,
                         @RequestParam(name = "limit", defaultValue = "10") int limit,
                         HttpServletRequest httpServletRequest){
        return ResultVOUtil.success( classroomStudentService.getClassroomStudentList(classRoomId,studentNumber,studentName,studentSchool,studentClassName,page,limit));
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 9:47
     * DESCRIPTION: 删除课堂学生
     */
    @ApiOperation("删除课堂学生")
    @DeleteMapping("/remove")
    public ResultVO removeStudent(@RequestParam(value = "id")Integer id){
        if (classroomStudentService.deleteByPrimaryKey(id)>0){
            return ResultVOUtil.success();
        }
        return  ResultVOUtil.error(21,"无此学生");
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 7:54
     * DESCRIPTION:工具类，有空再丢进Utils
     */
    public  String getStringInExcel( Cell cell){
        if(cell!=null){
            cell.setCellType(Cell.CELL_TYPE_STRING);
            return  cell.getStringCellValue();}
        return "";
    }

}
