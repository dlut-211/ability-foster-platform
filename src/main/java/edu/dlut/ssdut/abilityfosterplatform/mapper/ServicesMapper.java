package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Services;

public interface ServicesMapper {
    int insert(Services record);

    int insertSelective(Services record);
}