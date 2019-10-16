package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Messages;

public interface MessagesMapper {
    int insert(Messages record);

    int insertSelective(Messages record);
}