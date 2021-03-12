package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomStudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VClassroomStudentInfoMapper {
    int insert(VClassroomStudentInfo record);

    int insertSelective(VClassroomStudentInfo record);

    List<VClassroomStudentInfo> getAllByStudentId(int studentId);
}