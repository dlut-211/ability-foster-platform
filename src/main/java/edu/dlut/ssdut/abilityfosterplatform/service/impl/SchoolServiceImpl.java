package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.SchoolMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.School;
import edu.dlut.ssdut.abilityfosterplatform.repository.SchoolRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wdz
 * @Date: 2019/11/3 18:37
 * @Description:
 **/

@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;
    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public int insert(School record) {
        return schoolMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        return schoolMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public School selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<School> getAllSchoolList() {
        List<School> schoolList = schoolRepository.findAll();
        return schoolList;
    }
}
