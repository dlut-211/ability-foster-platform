package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

import java.util.List;

public interface StudentService {
    Student selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);

    Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOS);
}
