package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

public interface StudentService {
    Student selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);
}
