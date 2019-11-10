package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.VCourse;
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
import java.util.Date;
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
        course.setCreatedBy(1000);
        course.setCreatedOn(new Date());
        return ResultVOUtil.success(courseRepository.save(course));
    }

    @ApiOperation("上传文件")
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public ResultVO uploadFile(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {
        if(file.isEmpty()){
            return ResultVOUtil.error(400, "请选择上传文件");
        }
        Map<String, String> map = courseService.uploadFile(file, request);
        if (map!=null) {
            return ResultVOUtil.success(map);
        }
        else
            return ResultVOUtil.error(400, "上传失败");
    }

    @ApiOperation("通过课程编号、课程名称以及分页查询课程信息列表")
    @GetMapping("/getCourseList")
    public ResultVO getCourseList(@RequestParam(value = "code", required = false, defaultValue = "") String code,
                                  @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                  @RequestParam(name = "nowPage", defaultValue = "1") int nowPage,
                                  @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
        PageRequest request =  PageRequest.of(nowPage - 1, pageSize);
        Page<VCourse> coursePage = courseService.findByParams(code, name, request);
        return ResultVOUtil.success(coursePage);
    }

    @ApiOperation("通过id查询课程信息")
    @RequestMapping(value = "/selectCourseById", method = RequestMethod.GET)
    public ResultVO selectCourseById(@RequestParam("id") Integer id) {
        return ResultVOUtil.success(courseRepository.findById(id));
    }

    @ApiOperation("修改课程信息")
    @PostMapping(value = "/updateCourse")
    public ResultVO updateCourse(VCourse vCourse) {
        return ResultVOUtil.success(courseService.updateCourse(vCourse));
    }

    /**
     * 删除课程信息 - Raymond
     * @param id
     * @return
     */
    @ApiOperation("删除课程信息")
    @RequestMapping(value = "/deleteCourse", method = RequestMethod.DELETE)
    public ResultVO deleteCourse(@RequestParam("id") Integer id) {
        courseService.deleteCourse(id);
        return ResultVOUtil.success("删除成功");
    }

    @ApiOperation("查询所有学科信息")
    @RequestMapping(value = "/getAllSubjectList", method = RequestMethod.GET)
    public ResultVO getAllSubjectList() {
        List<SystemOption> allSubjectList = courseService.getAllSubjectList();
        return ResultVOUtil.success(allSubjectList);
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 10:14
     * DESCRIPTION:在课堂界面查询课程
     */
    @ApiOperation("在课堂界面查询课程")
    @GetMapping("/list")
    public ResultVO getList(@RequestParam(value = "Code", required = false, defaultValue = "") String code,
                         @RequestParam(value = "Name", required = false, defaultValue = "") String name,
                         @RequestParam(name = "page", defaultValue = "1") int page,
                         @RequestParam(name = "limit", defaultValue = "5") int limit){
        PageRequest request =  PageRequest.of(page - 1, limit);
        Page<VCourse> coursePage = courseService.findByParams(code, name, request);
        return ResultVOUtil.success(coursePage);
    }

}
