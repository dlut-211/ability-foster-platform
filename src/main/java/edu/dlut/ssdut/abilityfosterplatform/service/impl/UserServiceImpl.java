package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.UpdatePasswordDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TeacherMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.UserMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.model.User;
import edu.dlut.ssdut.abilityfosterplatform.repository.UserRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public User selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return userRepository.findUserByLoginAccountAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }

    @Override
    public int updatePassword(UpdatePasswordDTO updatePasswordDTO) {
        int i=0;
        if (updatePasswordDTO.getRoles()==1){
            User user = userMapper.selectByPrimaryKey(updatePasswordDTO.getId());
            if (user.getPassword().equals(DigestUtils.md5DigestAsHex(updatePasswordDTO.getOldPassword().getBytes()))) {
                user.setPassword(DigestUtils.md5DigestAsHex(updatePasswordDTO.getNewPassword().getBytes()));
                user.setModifiedOn(new Date());
                i = userMapper.updateByPrimaryKey(user);
            }
            else
                i=400;
        }
        if (updatePasswordDTO.getRoles()==2){
                Teacher teacher = teacherMapper.selectByPrimaryKey(updatePasswordDTO.getId());
            if (teacher.getPassword().equals(DigestUtils.md5DigestAsHex(updatePasswordDTO.getOldPassword().getBytes()))) {
                teacher.setPassword(DigestUtils.md5DigestAsHex(updatePasswordDTO.getNewPassword().getBytes()));
                teacher.setModifiedOn(new Date());
                i = teacherMapper.updateByPrimaryKeySelective(teacher);
            }
            else
                i=400;
        }
        if (updatePasswordDTO.getRoles()==3){
                Student student = studentMapper.selectByPrimaryKey(updatePasswordDTO.getId());
            if (student.getPassword().equals(DigestUtils.md5DigestAsHex(updatePasswordDTO.getOldPassword().getBytes()))) {
                student.setPassword(DigestUtils.md5DigestAsHex(updatePasswordDTO.getNewPassword().getBytes()));
                student.setModifiedOn(new Date());
                i = studentMapper.updateByPrimaryKey(student);
            }
            else
                i=400;
        }
        return i;
    }
}
