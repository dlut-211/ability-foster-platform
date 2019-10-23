package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.SystemOptionMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.SystemOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lhd
 * @Date 2019/10/17
 * @Description:
 **/

@Service
public class SystemOptionServiceImpl implements SystemOptionService{

    @Autowired
    private SystemOptionMapper systemOptionMapper;

    @Autowired
    private SystemOptionRepository systemOptionRepository;

    @Override
    public int insert(SystemOption record) {
        return systemOptionMapper.insert(record);
    }

    @Override
    public int insertSelective(SystemOption record) {
        return systemOptionMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemOption record) {
        return systemOptionMapper.updateByPrimaryKeySelective(record);
    }
}
