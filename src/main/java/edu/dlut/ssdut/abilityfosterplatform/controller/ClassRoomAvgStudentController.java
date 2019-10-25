package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.GetClassRoomListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgStudentClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
                                     @RequestParam(value = "TermType", required = false, defaultValue = "") Integer termType,
                                     @RequestParam(value = "Status", required = false, defaultValue = "") Integer status,
                                     @RequestParam(value = "Name", required = false, defaultValue = "") String name,
                                     @RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "limit", defaultValue = "10") int limit,
                                     HttpServletRequest httpServletRequest) throws ParseException {


        GetClassRoomListDTO  getClassRoomListDTO = new GetClassRoomListDTO();
        getClassRoomListDTO.setList(classRoomService.getClassRoomList(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,page,limit));

        getClassRoomListDTO.setTotal(classRoomService.getClassRoomListCount(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,page,limit));
        return ResultVOUtil.success(getClassRoomListDTO);
    }
}
