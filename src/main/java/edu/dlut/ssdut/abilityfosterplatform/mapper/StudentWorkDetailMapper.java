package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;

import java.util.List;

public interface StudentWorkDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentWorkDetail record);

    int insertSelective(StudentWorkDetail record);

    StudentWorkDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentWorkDetail record);

    int updateByPrimaryKey(StudentWorkDetail record);

    List<StudentWorkDetail> selectByStudentWorkId(Integer studentWorkId);
}
