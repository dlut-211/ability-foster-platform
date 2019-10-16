package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsSemanticSimilarityPopulation;

public interface DmFtsSemanticSimilarityPopulationMapper {
    int insert(DmFtsSemanticSimilarityPopulation record);

    int insertSelective(DmFtsSemanticSimilarityPopulation record);
}