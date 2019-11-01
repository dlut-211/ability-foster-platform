package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.GetClassRoomListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgStudentClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author :zjk
 * @Date :Create in 19:58 2019-10-23
 * @Description 获取课程平均分，个人分数
 **/
@Api(tags = "ClassRoomAvgStudentController")
@RestController
@RequestMapping("/api/classroom")
public class ClassRoomAvgStudentController {
    @Autowired
    private VAvgClassroomScoreMapper vAvgClassroomScoreMapper;

    @Autowired
    private VAvgStudentClassroomScoreMapper vAvgStudentClassroomScoreMapper;

    @Autowired
    private ClassRoomService classRoomService;

    @Autowired
    private TeacherService teacherService;
    @GetMapping("/classRoomAvgScore")
    @ApiOperation("获取学生个人成绩与课程平均分")
    public ResultVO getclassRoomAvgScore(Integer studentId){
        System.out.println("进来了");
        List<Float> studentAvgScoreList = vAvgStudentClassroomScoreMapper.selectAVgScore(studentId);
        List<NameAndAvgScoreDTO> classroomAvgScore = vAvgClassroomScoreMapper.selectNameAndScore(studentId);
        for (Float aFloat : studentAvgScoreList) {
            System.out.println(aFloat);
        }
        for (int i = 0; i < classroomAvgScore.size(); i++) {
            classroomAvgScore.get(i).setMyAvgScore(studentAvgScoreList.get(i));
        }
        return ResultVOUtil.success(classroomAvgScore);
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/25 8:44
     * DESCRIPTION: 查询课堂列表
     */
    @ApiOperation("查询课堂")
    @GetMapping("/list")
    public ResultVO getClassRoomList(@RequestParam(value = "BeginDateStart", required = false, defaultValue = "") String beginDateStart,
                                     @RequestParam(value = "BeginDateEnd", required = false, defaultValue = "") String beginDateEnd,
                                     @RequestParam(value = "EndDateStart", required = false, defaultValue = "") String endDateStart,
                                     @RequestParam(value = "EndDateEnd", required = false, defaultValue = "") String endDateEnd,
                                     @RequestParam(value = "TermType", required = false, defaultValue = "") String termType1,
                                     @RequestParam(value = "Status", required = false, defaultValue = "") String status1,
                                     @RequestParam(value = "Name", required = false, defaultValue = "") String name,
                                     @RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "limit", defaultValue = "10") int limit,
                                     HttpServletRequest httpServletRequest) throws ParseException {
            Integer termType = 0;
            Integer status = 0;
        if(termType1.equals("null")){
            termType=null;
        }else {
            termType=Integer.parseInt(termType1);
        }
        if(status1.equals("null")){
            status = null;
        }else {
            status = Integer.parseInt(status1);
        }
        String teacherToken = httpServletRequest.getHeader("Authorization");
        //TODO:要通过当前登录教师的token查找他创建的课程，目前是全部展示

        GetClassRoomListDTO  getClassRoomListDTO = new GetClassRoomListDTO();
        List<VClassroomList> vClassroomListList =classRoomService.getClassRoomList(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,page,limit);
        for(int i = 0; i< vClassroomListList.size();i++){

            VClassroomList tempVClassroomList = vClassroomListList.get(i);
            Integer tmpStatus =tempVClassroomList.getStatus();
            Integer tmpTermType = tempVClassroomList.getTermType();
            if(tmpStatus ==4){
                tempVClassroomList.setStatusName("已结课");
            }
            if(tmpStatus ==2){
                tempVClassroomList.setStatusName("已开课");
            }
            if(tmpStatus ==1){
                tempVClassroomList.setStatusName("未开课");
            }
            if(tmpTermType ==1){
                tempVClassroomList.setTermTypeName("春季学期");
            }
            if(tmpTermType ==2){
                tempVClassroomList.setTermTypeName("夏季学期");
            }
            if(tmpTermType ==3){
                tempVClassroomList.setTermTypeName("冬季学期");
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            tempVClassroomList.setDateFormat(dateFormat.format(tempVClassroomList.getBeginDate())+" - "+dateFormat.format(tempVClassroomList.getBeginDate())) ;

            vClassroomListList.set(i,tempVClassroomList);
        }
        getClassRoomListDTO.setList(vClassroomListList);

        getClassRoomListDTO.setTotal(classRoomService.getClassRoomListCount(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,page,limit));
        return ResultVOUtil.success(getClassRoomListDTO);
    }
    /**
     * @Author YuJunMing
     * @Date 2019/10/26 8:19
     * DESCRIPTION: 开课 结课状态的改变
     */
    @ApiOperation("开课 结课状态的改变")
    @PutMapping("/editstatus")
    public ResultVO editStatus(@RequestParam Map<String, String> params , HttpServletRequest request){
        System.out.println(request.getHeader("Authorization"));
        if(classRoomService.editStatus(params.get("Id"),params.get("Status")) >0){
            if (params.get("Status").equals("2")){
                return ResultVOUtil.success("开课成功");
            }else if (params.get("Status").equals("4")){
                return ResultVOUtil.success("结课成功");
            }
        }
        return ResultVOUtil.error(21,"修改失败");
    }

        /**
         * @Author YuJunMing
         * @Date 2019/10/26 10:27
         * DESCRIPTION:添加课堂
         */
        @ApiOperation("添加课堂")
        @PostMapping("/add")
    public ResultVO addClassRoom(@RequestParam Map<String, String> params , HttpServletRequest request) throws ParseException {
            String token = request.getHeader("Authorization");
            if(token!=null){Integer teacherId=teacherService.getTeacherIdByToken(token);}
            Classroom classroom = new Classroom();

            String TimeStart = params.get("BeginDate").replace("Z", " UTC");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
            Date callbackTimeStart = format.parse(TimeStart);    //Fri Dec 28 00:00:00 GMT+08:00 2018
            classroom.setBeginDate(callbackTimeStart);

             TimeStart = params.get("EndDate").replace("Z", " UTC");
             format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
            callbackTimeStart = format.parse(TimeStart);
            classroom.setEndDate(callbackTimeStart);

            classroom.setCourseId(Integer.parseInt(params.get("CourseId")));
            classroom.setTermType(Integer.parseInt(params.get("TermType")));
            classroom.setName(params.get("Name"));
            classroom.setTestPerformanceWeight(new BigDecimal(params.get("TestPerformaceWeight")));
            classroom.setDailyPerformanceWeight(new BigDecimal(params.get("dailyPerformanceWeight")));
            classroom.setStatus(1);

            classroom.setCreatedBy(1000);//如果传token了就可以直接用teacherId
            classroom.setCreatedOn(new Date());
            System.out.println(classroom);

            return ResultVOUtil.success(classRoomService.insert(classroom));
        }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 11:37
     * DESCRIPTION:
     */
    @ApiOperation("编辑课堂")
    @PutMapping("/edit")
    public ResultVO editClassroom(@RequestParam Map<String, String> params , HttpServletRequest request) throws ParseException {
        Classroom classroom = new Classroom();
        classroom.setId(Integer.parseInt(params.get("Id")));

        String TimeStart = params.get("BeginDate").replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date callbackTimeStart = format.parse(TimeStart);    //Fri Dec 28 00:00:00 GMT+08:00 2018
        classroom.setBeginDate(callbackTimeStart);

        TimeStart = params.get("EndDate").replace("Z", " UTC");
        format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        callbackTimeStart = format.parse(TimeStart);
        classroom.setEndDate(callbackTimeStart);

        classroom.setCourseId(Integer.parseInt(params.get("CourseId")));
        classroom.setTermType(Integer.parseInt(params.get("TermType")));
        classroom.setName(params.get("Name"));
        classroom.setTestPerformanceWeight(new BigDecimal(params.get("TestPerformaceWeight")));
        classroom.setDailyPerformanceWeight(new BigDecimal(params.get("dailyPerformanceWeight")));

        return ResultVOUtil.success(classRoomService.updateByPrimaryKeySelective(classroom));
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 11:38
     * DESCRIPTION:
     */
    @ApiOperation("删除课堂")
    @DeleteMapping("/remove")
    public ResultVO editClassroom(@RequestParam(value = "id") Integer id , HttpServletRequest request)   {
            Integer statusCode =   ResultVOUtil.success(classRoomService.deleteByPrimaryKey(id)).getStatusCode();
        if(statusCode ==1){
            return ResultVOUtil.success("");
        }
        return ResultVOUtil.error(statusCode,"删除数据失败");

    }
}
