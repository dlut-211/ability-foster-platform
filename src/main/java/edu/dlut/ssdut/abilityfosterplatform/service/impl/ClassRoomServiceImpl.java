package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VClassroomListMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Author YuJunMing
 * @Date 2019/10/25 11:50
 * DESCRIPTION:
 */
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    private ClassroomMapper classroomMapper;
    @Autowired
    private VClassroomListMapper vClassroomListMapper;


/**
 * @Author YuJunMing
 * @Date 2019/10/26 8:41
 * DESCRIPTION: 获取课堂列表
 */
    @Override
    public List<VClassroomList> getClassRoomList(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit) {
//        return classroomMapper.getClassRoomList(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,page,limit);
        int tmp = (page-1)*limit;

        return vClassroomListMapper.getClassRoomList(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,tmp,limit);
    }
/**
 * @Author YuJunMing
 * @Date 2019/10/26 8:41
 * DESCRIPTION: 获取课堂总数
 */
    @Override
    public Integer getClassRoomListCount(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit) {
        int tmp = (page-1)*limit;

        return vClassroomListMapper.getClassRoomListCount(beginDateStart,beginDateEnd,endDateStart,endDateEnd,termType,status,name,tmp,limit);

    }

    @Override
    public Integer editStatus(String Id, String Status) {
        return classroomMapper.editStatus(Id,Status);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return classroomMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Classroom record) {
        return classroomMapper.insert(record);
    }

    @Override
    public int insertSelective(Classroom record) {
        return 0;
    }

    @Override
    public Classroom selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Classroom record) {
        return classroomMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classroom record) {
        return classroomMapper.updateByPrimaryKey(record);
    }

    @Override
    public Classroom selectClassroomByCid(Integer id){
        return classroomMapper.selectClassroomByCid(id);
    }

    @Override
    public List<Classroom> getClassroomList(){
        return classroomMapper.getClassroomList();
    }

}
