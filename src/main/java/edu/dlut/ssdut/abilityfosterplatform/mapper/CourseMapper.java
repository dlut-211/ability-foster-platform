package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}