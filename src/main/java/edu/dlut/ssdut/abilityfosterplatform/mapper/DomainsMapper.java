package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Domains;

public interface DomainsMapper {
    int insert(Domains record);

    int insertSelective(Domains record);
}