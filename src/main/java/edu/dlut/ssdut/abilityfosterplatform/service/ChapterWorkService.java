package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Work;

/**
 * @Author: raymond
 * @Date: 2019/10/24 18:52
 * @Description:
 **/
public interface ChapterWorkService {

    void remove(Integer id);

    Work edit(ChapterWorkDTO chapterWorkDTO);

    Work add(ChapterWorkDTO chapterWorkDTO);

    ChapterWorkDTO list(Integer chapterId);

}
