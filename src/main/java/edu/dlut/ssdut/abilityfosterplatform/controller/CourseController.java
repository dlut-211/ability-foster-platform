package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.repository.CourseRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.CourseService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Api(tags = "CourseController")
@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;


    @ApiOperation("添加课程信息")
    @RequestMapping(value = "/insertCourse", method = RequestMethod.POST)
    public ResultVO insertCourse(Course course) {
        return ResultVOUtil.success(courseRepository.save(course));
    }

    @ApiOperation("上传文件")
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public ResultVO uploadFile(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {
        Map<String, String> map = courseService.uploadFile(file, request);
        return ResultVOUtil.success(map);
    }

    @ApiOperation("通过课程编号、课程名称以及分页查询课程信息列表")
    @GetMapping("/getCourseList")
    public ResultVO getCourseList(@RequestParam(value = "code", required = false, defaultValue = "") String code,
                                  @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                  @RequestParam(name = "nowPage", defaultValue = "1") int nowPage,
                                  @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                  HttpServletRequest httpServletRequest) {
        PageRequest request =  PageRequest.of(nowPage - 1, pageSize);
        Page<CourseDTO> coursePage = courseService.findByParams(code, name, request, httpServletRequest);
        return ResultVOUtil.success(coursePage);
    }

    @ApiOperation("通过id查询课程信息")
    @RequestMapping(value = "/selectCourseById", method = RequestMethod.GET)
    public ResultVO selectCourseById(@RequestParam("id") Integer id) {
        return ResultVOUtil.success(courseRepository.findById(id));
    }

    @ApiOperation("修改课程信息")
    @RequestMapping(value = "/updateCourse", method = RequestMethod.PUT)
    public ResultVO updateCourse(@RequestBody Course course) {
        return ResultVOUtil.success(courseRepository.saveAndFlush(course));
    }

    @ApiOperation("删除课程信息")
    @RequestMapping(value = "/deleteCourse", method = RequestMethod.DELETE)
    public ResultVO deleteCourse(@RequestParam("id") Integer id) {
        courseRepository.deleteById(id);
        return ResultVOUtil.success("删除成功");
    }

    @ApiOperation("查询所有学科信息")
    @RequestMapping(value = "/getAllSubjectList", method = RequestMethod.GET)
    public ResultVO getAllSubjectList() {
        List<SystemOption> allSubjectList = courseService.getAllSubjectList();
        return ResultVOUtil.success(allSubjectList);
    }
}
