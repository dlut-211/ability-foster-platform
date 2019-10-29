package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.InsertStudentDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Integer insertStudentList(List<InsertStudentDTO> insertStudentDTOS);

    int insertStudent(InsertStudentDTO insertStudentDTO);

    Student selectByNumber(String number);
}