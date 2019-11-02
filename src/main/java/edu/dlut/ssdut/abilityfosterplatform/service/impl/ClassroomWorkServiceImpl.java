package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.VChapterWorkListMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkList;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 20:58 2019-11-01
 * @Description 课堂作业实现类
 **/
@Service
public class ClassroomWorkServiceImpl implements ClassroomWorkService {
    @Autowired
    private VChapterWorkListMapper vChapterWorkListMapper;
    @Override
    public List<VChapterWorkList> selectChapterWorkList(Integer classroomId, Integer chapterId) {
        return vChapterWorkListMapper.selectChapterWorkList(classroomId,chapterId);
    }
}
