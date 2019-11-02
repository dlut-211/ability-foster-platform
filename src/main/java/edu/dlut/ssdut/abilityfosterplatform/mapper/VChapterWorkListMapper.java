package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkList;

import java.util.List;

public interface VChapterWorkListMapper {
    int insert(VChapterWorkList record);

    int insertSelective(VChapterWorkList record);

    List<VChapterWorkList> selectChapterWorkList(Integer classroomId, Integer chapterId);
}
