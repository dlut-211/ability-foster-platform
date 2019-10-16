package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ColumnStoreSegments;

public interface ColumnStoreSegmentsMapper {
    int insert(ColumnStoreSegments record);

    int insertSelective(ColumnStoreSegments record);
}