package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.School;

import java.util.List;

/**
 * @Author: wdz
 * @Date: 2019/11/3 18:33
 * @Description:
 **/
public interface SchoolService {
    /** 添加学校 **/
    int insert(School record);
    /** 删除学校 **/
    int deleteByPrimaryKey(Integer id);
    /** 修改学校 **/
    int updateByPrimaryKeySelective(School record);
    /** 查询学校 **/
    School selectByPrimaryKey(Integer id);
    /** 获取学校列表 **/
    List<School> getAllSchoolList();
}
