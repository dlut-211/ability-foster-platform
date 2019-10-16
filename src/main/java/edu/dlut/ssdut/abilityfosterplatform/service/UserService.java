package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Users;

public interface UserService {
    public Users selectByAccountAndPassword(LoginInfo loginInfo);
}
