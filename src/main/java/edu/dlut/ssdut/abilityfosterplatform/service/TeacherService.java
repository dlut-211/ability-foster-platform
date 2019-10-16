package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;

public interface TeacherService {
    public Teacher selectByAccountAndPassword(LoginInfo loginInfo);
}
