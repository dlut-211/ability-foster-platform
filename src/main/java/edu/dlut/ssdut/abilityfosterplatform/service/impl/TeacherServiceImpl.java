package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return teacherRepository.findTeacherByNumberAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }

    @Override
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    public int insertSelective(Teacher record) {
        return teacherMapper.insertSelective(record);
    }

    @Override
    public Teacher selectByPrimaryKey(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

    @Override
    public Teacher selectByAccountAndPassword(LoginInfo loginInfo) {
        return teacherMapper.selectByAccountAndPassword(loginInfo);
    }

    @Override
    public Integer getTeacherIdByToken(String string) {
        return teacherMapper.getTeacherIdByToken(string);
    }

    @Override
    public void updateToken(String token) {
        teacherMapper.updateToken(token);
    }

}
