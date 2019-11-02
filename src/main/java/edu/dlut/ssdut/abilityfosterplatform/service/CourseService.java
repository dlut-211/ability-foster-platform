package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface CourseService {

    /** 通过课程编号、课程名称返回CourseDTO列表及分页信息 **/
    Page<CourseDTO> findByParams(String code, String name, Pageable pageable, HttpServletRequest request);

    /** 上传文件 **/
    Map<String, String> uploadFile(MultipartFile file, HttpServletRequest request);

    /** 获取所有的学科列表 **/
    List<SystemOption> getAllSubjectList();

    /** 通过Id更新课程 **/
    int updateCourseById(Course record);

    void deleteCourse(Integer courseId);

}
