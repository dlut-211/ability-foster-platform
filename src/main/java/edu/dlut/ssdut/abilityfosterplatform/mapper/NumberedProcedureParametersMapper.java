package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.NumberedProcedureParameters;

public interface NumberedProcedureParametersMapper {
    int insert(NumberedProcedureParameters record);

    int insertSelective(NumberedProcedureParameters record);
}