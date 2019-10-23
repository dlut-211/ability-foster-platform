package edu.dlut.ssdut.abilityfosterplatform.service;

<<<<<<< HEAD
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

import java.util.List;

public interface TeacherService {
    int deleteByPrimaryKey(Integer id);

=======
import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

public interface TeacherService {
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
    int insert(Teacher record);

    int insertSelective(Teacher record);

<<<<<<< HEAD
    Teacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    Teacher selectByAccountAndPassword(LoginInfo loginInfo);
=======
    int updateByPrimaryKeySelective(Teacher record);

    int deleteByPrimaryKey(Integer id);

    Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);

>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
}
