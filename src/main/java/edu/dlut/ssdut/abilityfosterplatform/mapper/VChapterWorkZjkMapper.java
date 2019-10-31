package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface VChapterWorkZjkMapper {
    int insert(VChapterWorkZjk record);

    int insertSelective(VChapterWorkZjk record);

    //学生页面—我的课堂—章节作业
    List<VChapterWorkZjk> findChapterWork(Integer classroomId, Integer studentId, Integer startSize, Integer pageSize);
}
