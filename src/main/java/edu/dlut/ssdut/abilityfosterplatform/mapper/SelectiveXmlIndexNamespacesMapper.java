package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SelectiveXmlIndexNamespaces;

public interface SelectiveXmlIndexNamespacesMapper {
    int insert(SelectiveXmlIndexNamespaces record);

    int insertSelective(SelectiveXmlIndexNamespaces record);
}