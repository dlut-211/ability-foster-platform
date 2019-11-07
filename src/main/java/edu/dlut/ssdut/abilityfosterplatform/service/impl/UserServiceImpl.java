package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.User;
import edu.dlut.ssdut.abilityfosterplatform.repository.UserRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return userRepository.findUserByLoginAccountAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }
}
