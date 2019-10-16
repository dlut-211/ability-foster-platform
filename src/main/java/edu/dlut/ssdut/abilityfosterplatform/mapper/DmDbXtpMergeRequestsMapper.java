package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpMergeRequests;

public interface DmDbXtpMergeRequestsMapper {
    int insert(DmDbXtpMergeRequests record);

    int insertSelective(DmDbXtpMergeRequests record);
}