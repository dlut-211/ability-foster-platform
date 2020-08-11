package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

public interface TeacherService {

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Teacher record);

    Teacher selectByAccountAndPassword(LoginInfo loginInfo);

    int updateByPrimaryKeySelective(Teacher record);

    int deleteByPrimaryKey(Integer id);

    Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);

    Integer getTeacherIdByToken(String string);

    void updateToken(int id,String token);
}
