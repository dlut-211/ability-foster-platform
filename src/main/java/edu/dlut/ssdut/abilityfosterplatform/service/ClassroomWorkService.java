package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkList;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * @Author: zjk
 * @Date 2019/11/01 20:57
 * @Description:
 **/
public interface ClassroomWorkService {
    List<VChapterWorkList>selectChapterWorkList(Integer classroomId,Integer chapterId);
}
