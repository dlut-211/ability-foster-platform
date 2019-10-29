package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.User;

public interface UserService {
    User selectByAccountAndPassword(LoginInfoDTO loginInfoDTO);
}
