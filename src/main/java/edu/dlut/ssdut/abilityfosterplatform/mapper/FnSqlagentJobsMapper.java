package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnSqlagentJobs;

public interface FnSqlagentJobsMapper {
    int insert(FnSqlagentJobs record);

    int insertSelective(FnSqlagentJobs record);
}