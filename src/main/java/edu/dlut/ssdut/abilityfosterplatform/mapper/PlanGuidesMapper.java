package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.PlanGuides;

public interface PlanGuidesMapper {
    int insert(PlanGuides record);

    int insertSelective(PlanGuides record);
}