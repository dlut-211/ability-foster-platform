package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ClassRoomStudentListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomStudentMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomStudent;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Author YuJunMing
 * @Date 2019/10/26 9:06
 * DESCRIPTION:
 */
@Service
public class ClassroomStudentServiceImpl implements ClassroomStudentService {
    @Autowired
    private ClassroomStudentMapper classroomStudentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return classroomStudentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ClassroomStudent record) {
        return 0;
    }

    @Override
    public int insertSelective(ClassroomStudent record) {
        return 0;
    }

    @Override
    public ClassroomStudent selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassroomStudent record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ClassroomStudent record) {
        return 0;
    }

    @Override
    public Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOS) {
        return null;
    }

    @Override
    public List<ClassRoomStudentListDTO> getClassroomStudentList(Integer classRoomId, String studentNumber, String studentName, String studentSchool, String studentClassName, int page, int limit) {
        int tmp = (page-1)*limit;
        return classroomStudentMapper.getClassroomStudentList(classRoomId,studentNumber,studentName,studentSchool,studentClassName,tmp,limit);
    }


}
