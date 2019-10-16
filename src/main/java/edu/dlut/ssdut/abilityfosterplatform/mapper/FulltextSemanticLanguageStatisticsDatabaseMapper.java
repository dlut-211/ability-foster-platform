package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextSemanticLanguageStatisticsDatabase;

public interface FulltextSemanticLanguageStatisticsDatabaseMapper {
    int insert(FulltextSemanticLanguageStatisticsDatabase record);

    int insertSelective(FulltextSemanticLanguageStatisticsDatabase record);
}