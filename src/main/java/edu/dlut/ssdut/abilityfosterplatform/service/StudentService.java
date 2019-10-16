package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

public interface StudentService {
    Student selectByAccountAndPassword(LoginInfo loginInfo);
}
