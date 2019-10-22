package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;

/**
 * @Author: raymond
 * @Date 2019/10/16 10:23
 * @Description:
 **/
public interface AbilityService {
    Ability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ability record);
}
