package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ColumnDomainUsage;

public interface ColumnDomainUsageMapper {
    int insert(ColumnDomainUsage record);

    int insertSelective(ColumnDomainUsage record);
}