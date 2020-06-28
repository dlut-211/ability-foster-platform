package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.ClassRoomStudentListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomStudent;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

import java.util.List;

public interface ClassroomStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomStudent record);

    int insertSelective(ClassroomStudent record);

    ClassroomStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomStudent record);

    int updateByPrimaryKey(ClassroomStudent record);

    Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOS);

    List<ClassRoomStudentListDTO> getClassroomStudentList(Integer classRoomId, String studentNumber, String studentName, String studentSchool, String studentClassName, int tmp, int limit);

    List<ClassroomStudent>selectByClassroomId(Integer classroomId);

    int selectStudentCount(Integer classRoomId, String studentNumber, String studentName, String studentSchool, String studentClassName);
}

