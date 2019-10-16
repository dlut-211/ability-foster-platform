package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnMsxeReadEventStream;

public interface FnMsxeReadEventStreamMapper {
    int insert(FnMsxeReadEventStream record);

    int insertSelective(FnMsxeReadEventStream record);
}