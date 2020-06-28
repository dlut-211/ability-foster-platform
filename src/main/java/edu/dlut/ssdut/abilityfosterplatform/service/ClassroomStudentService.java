package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.ClassRoomStudentListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomStudent;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

import java.util.List;
/**
 * @Author YuJunMing
 * @Date 2019/10/26 8:59
 * DESCRIPTION:
 */
public interface ClassroomStudentService {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomStudent record);

    int insertSelective(ClassroomStudent record);

    ClassroomStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomStudent record);

    int updateByPrimaryKey(ClassroomStudent record);

    Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOS);

    List<ClassRoomStudentListDTO> getClassroomStudentList(Integer classRoomId, String studentNumber, String studentName, String studentSchool, String studentClassName, int page, int limit);

    int selectStudentCount(Integer classRoomId, String studentNumber, String studentName, String studentSchool, String studentClassName);
}
