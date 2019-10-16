package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SelectiveXmlIndexPaths;

public interface SelectiveXmlIndexPathsMapper {
    int insert(SelectiveXmlIndexPaths record);

    int insertSelective(SelectiveXmlIndexPaths record);
}