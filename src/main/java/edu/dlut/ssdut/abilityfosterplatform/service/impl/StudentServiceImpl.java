package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomStudentMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.repository.StudentRepositoory;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepositoory studentRepositoory;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassroomStudentMapper classroomStudentMapper;
    @Override
    public Student selectByAccountAndPassword(LoginInfoDTO loginInfoDTO) {
        return studentRepositoory.findStudentByNumberAndPassword(loginInfoDTO.getNumber(),loginInfoDTO.getPassword());
    }

    /**
     * @Author YuJunMing
     * @Date 2019/10/26 7:56
     * DESCRIPTION:
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOList) {
        for(int i =0;i<insertStudentDTOList.size();i++){
            Student student = studentMapper.selectByNumber(insertStudentDTOList.get(i).getStudentId().toString());
            if(student==null){
            studentMapper.insertStudent(insertStudentDTOList.get(i));
            }
//            else {
//                InsertStudentDTO insertStudentDTO =   insertStudentDTOList.get(i);
//                insertStudentDTO.setStudentId(student.getId());
//                insertStudentDTOList.set(i,insertStudentDTO);
//            }
        }
        if(classroomStudentMapper.insertStudentList(insertStudentDTOList)!=0){
                return 1;
        }
        return 0;
    }
}
