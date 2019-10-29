package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "ClassRoomController")
@RestController
@RequestMapping("/api/classRoom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @ApiOperation("获取课堂列表")
    @GetMapping("/list")
    public ResultVO getClassroomList(){
        return ResultVOUtil.success(classRoomService.getClassroomList());
    }

    @ApiOperation("通过id查找课堂信息列表")
    @RequestMapping(value = "/selectClassroomByCid", method = RequestMethod.GET)
    public ResultVO selectClassroomByCid(@RequestParam("id") Integer id) {
        return ResultVOUtil.success(classRoomService.selectClassroomByCid(id));
    }

}
