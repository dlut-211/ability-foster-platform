package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

public interface TeacherService {
    int insert(Teacher record);

    int insertSelective(Teacher record);

    int updateByPrimaryKeySelective(Teacher record);

    int deleteByPrimaryKey(Integer id);

    Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);

}
