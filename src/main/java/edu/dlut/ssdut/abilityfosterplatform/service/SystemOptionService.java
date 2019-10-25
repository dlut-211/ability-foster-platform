package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: lhd
 * @Date 2019/10/17
 * @Description:
 **/
public interface SystemOptionService {

    int insert(SystemOption record);

    int insertSelective(SystemOption record);

    int updateByPrimaryKeySelective(SystemOption record);
}
