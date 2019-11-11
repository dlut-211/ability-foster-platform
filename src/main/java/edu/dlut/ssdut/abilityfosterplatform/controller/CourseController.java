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
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    @RequestMapping(value = "/testDownload", method = RequestMethod.GET)
    public void Download(HttpServletResponse res,String filename) throws IOException {
     //String filename = "1573460185791_40920191103.doc";
        if (filename != null) {
            FileInputStream is = null;
            BufferedInputStream bs = null;
            OutputStream os = null;
            try {
                File file = new File("src/main/resources/static/uploadFile/"+filename);
                if (file.exists()) {
                    //设置Headers
                    res.setHeader("Content-Type","application/octet-stream");
                    //设置下载的文件的名称-该方式已解决中文乱码问题
                    res.setHeader("Content-Disposition","attachment;filename=" +  new String( filename.getBytes("gb2312"), "ISO8859-1" ));
                    is = new FileInputStream(file);
                    bs =new BufferedInputStream(is);
                    os = res.getOutputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while((len = bs.read(buffer)) != -1){
                        os.write(buffer,0,len);
                    }
                }else{
                   System.out.println("ccccccccc");
                 //   res.sendRedirect("/imgUpload/imgList?error="+error);
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }finally {
                try{
                    if(is != null){
                        is.close();
                    }
                    if( bs != null ){
                        bs.close();
                    }
                    if( os != null){
                        os.flush();
                        os.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

        //InputStream f= this.getClass().getResourceAsStream("/static/uploadFile1573460185791_40920191103.doc");
      //  File file = new File("src/main/resources/static/uploadFile/"+fileName);
     //   System.out.println("下载的文件名"+file.getAbsolutePath()+"-----------------");
      //  Resource resource = new ClassPathResource("/static/uploadFile1573460185791_40920191103.doc");
    //    File sourceFile =  resource.getFile();
    //    System.out.println("-----下载的文件名"+sourceFile.getAbsolutePath());
     //   res.setHeader("content-type", "application/octet-stream");
       // res.setContentType("multipart/form-data");
     //   res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
      //  res.setContentType("multipart/form-data");
     //   res.setContentType("application/x-msdownload;charset=utf-8");
      //  res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
     //   res.setContentType("multipart/form-data");
      // res.addHeader("Content-Disposition","attachment;fileName=" +new String(fileName.getBytes("UTF-8"),"iso-8859-1"));
//      res.setHeader("Content-Disposition", "attachment;fileName="+ new String(fileName.getBytes("UTF-8"),"ISO-8859-1"));
//        byte[] buff = new byte[1024];
//        BufferedInputStream bis = null;
//        OutputStream os = null;
//        try {
//            os = res.getOutputStream();
//            bis = new BufferedInputStream(new FileInputStream(new File(file.getAbsolutePath())));
//            int i = bis.read(buff);
//            while (i != -1) {
//                os.write(buff, 0, buff.length);
//                os.flush();
//                i = bis.read(buff);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null) {
//                try {
//                    bis.close();
//                    System.out.println("success");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }





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
