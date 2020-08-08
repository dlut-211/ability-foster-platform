package edu.dlut.ssdut.abilityfosterplatform.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.VCourse;
import edu.dlut.ssdut.abilityfosterplatform.repository.CourseRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.CourseService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Constants;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.mysql.cj.conf.PropertyKey.logger;

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

    @ApiOperation("下载文件")
    @RequestMapping(value = "/fileDownload", method = RequestMethod.GET)
    public void Download(HttpServletResponse response,String fileName) throws IOException {
        File file = new File("src/main/resources/static/uploadFile/" + fileName);
        if(file.exists()) {  //判断文件父目录是否存在
            System.out.println("aaa");
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);  //3.设置content-disposition响应头控制浏览器以下载的形式打开文件

            byte[] buff = new byte[1024];    //5.创建数据缓冲区
            BufferedInputStream bis = null;
            OutputStream os = null;
            try {
                os = response.getOutputStream(); //6.通过response对象获取OutputStream流
                bis = new BufferedInputStream(new FileInputStream(file));     //4.根据文件路径获取要下载的文件输入流
                int i = bis.read(buff);         //7.将FileInputStream流写入到buffer缓冲区
                while (i != -1) {
                    os.write(buff, 0, buff.length); //8.使用将OutputStream缓冲区的数据输出到客户端浏览器
                    os.flush();
                    i = bis.read(buff);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @ApiOperation("通过课程编号、课程名称以及分页查询课程信息列表")
    @GetMapping("/getCourseList")
    public ResultVO getCourseList(@RequestParam(value = "Code", required = false, defaultValue = "") String code,
                                  @RequestParam(value = "Name", required = false, defaultValue = "") String name,
//                                  @RequestParam(name = "nowPage", defaultValue = "1") int nowPage,
//                                  @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
                                  @RequestParam(name = "page", defaultValue = "1") int nowPage,
                                 @RequestParam(name = "limit", defaultValue = "10") int pageSize) {
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
        Integer result = courseService.deleteCourse(id);
        if (result.equals(ResultEnum.SUCCESS.getCode())) {
            return ResultVOUtil.success("删除成功");
        } else {
            return ResultVOUtil.error(result, "删除失败-课程正在被引用");
        }

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

//    /**
//     * @Author YuJunMing
//     * @Date 2019/11/12 12:31
//     * DESCRIPTION:
//     */
//    //TODO:待完成
//    @ApiOperation("下载doc")
//    @RequestMapping("/testDownload1")
//    public void testDownload(HttpServletRequest request,HttpServletResponse response) {
//
//        FileInputStream fis = null;
//        XWPFDocument document;
//        try {
//            //获取文件路径
//            String filepath = "C:\\Users\\yu\\Desktop\\郁骏铭2019.10.28进度.doc";
//            File file = new File(filepath);
//            String filename = file.getName();
//            fis = new FileInputStream(file);
//            //设置文件名及后缀
//            response.setHeader("Content-Disposition", "attachment; filename=" + new String(filename.getBytes(), "ISO-8859-1"));
//
//                document = new XWPFDocument(OPCPackage.open(fis));
//                document.write(response.getOutputStream());
//
//        } catch (FileNotFoundException e) {
//        } catch (IOException e) {
//        }  catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }

}
