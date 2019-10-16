package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.NumberedProcedures;

public interface NumberedProceduresMapper {
    int insert(NumberedProcedures record);

    int insertSelective(NumberedProcedures record);
}