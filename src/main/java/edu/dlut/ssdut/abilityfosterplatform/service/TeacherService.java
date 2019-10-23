package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

import java.util.List;

public interface TeacherService {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    Teacher selectByAccountAndPassword(LoginInfo loginInfo);
}
