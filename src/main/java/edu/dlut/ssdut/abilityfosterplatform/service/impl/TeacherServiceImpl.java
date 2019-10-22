package edu.dlut.ssdut.abilityfosterplatform.service.impl;


import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.SystemOptionMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
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
    public Teacher selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return teacherRepository.findTeacherByNumberAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }

    @Override
    public int insert(Teacher record) {
        teacherMapper.insert(record);
        return 0;
    }

    @Override
    public int insertSelective(Teacher record) {
        teacherMapper.insertSelective(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int  deleteByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

}
