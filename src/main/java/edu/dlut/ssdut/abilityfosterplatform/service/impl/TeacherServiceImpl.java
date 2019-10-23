package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Teacher record) {
        return 0;
    }

    @Override
    public int insertSelective(Teacher record) {
        return 0;
    }

    @Override
    public Teacher selectByPrimaryKey(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return 0;
    }

    @Override
    public Teacher selectByAccountAndPassword(LoginInfo loginInfo) {
        return teacherMapper.selectByAccountAndPassword(loginInfo);
    }

}
