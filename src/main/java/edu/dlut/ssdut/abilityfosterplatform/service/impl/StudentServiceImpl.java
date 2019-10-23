package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.repository.StudentRepositoory;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepositoory studentRepositoory;
    @Override
    public Student selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return studentRepositoory.findStudentByNumberAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }
}
