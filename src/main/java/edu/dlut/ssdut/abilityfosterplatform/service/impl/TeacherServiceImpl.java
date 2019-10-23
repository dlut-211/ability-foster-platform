package edu.dlut.ssdut.abilityfosterplatform.service.impl;

<<<<<<< HEAD
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
=======

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.SystemOptionMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
<<<<<<< HEAD

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
=======
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return teacherRepository.findTeacherByNumberAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
    }

    @Override
    public int insert(Teacher record) {
<<<<<<< HEAD
=======
        teacherMapper.insert(record);
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
        return 0;
    }

    @Override
    public int insertSelective(Teacher record) {
<<<<<<< HEAD
=======
        teacherMapper.insertSelective(record);
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
        return 0;
    }

    @Override
<<<<<<< HEAD
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
=======
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int  deleteByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
    }

}
