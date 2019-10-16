package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmQnSubscriptions;

public interface DmQnSubscriptionsMapper {
    int insert(DmQnSubscriptions record);

    int insertSelective(DmQnSubscriptions record);
}