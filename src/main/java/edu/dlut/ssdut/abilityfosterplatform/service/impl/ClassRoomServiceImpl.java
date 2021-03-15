package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomWorkMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VClassroomListMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.*;
import edu.dlut.ssdut.abilityfosterplatform.repository.KnowledgeTestRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private ClassroomWorkMapper classroomWorkMapper;
    @Autowired
    private KnowledgeTestRepository knowledgeTestRepository;


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

         classroomMapper.insert(record);
         return record.getId();
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

    @Override
    public int addClassRoom(Map<String, String> params, Integer teacherId) throws ParseException {
        Classroom classroom = new Classroom();

        String TimeStart = params.get("BeginDate").replace("Z", " UTC");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        Date callbackTimeStart = format.parse(TimeStart);    //Fri Dec 28 00:00:00 GMT+08:00 2018
        classroom.setBeginDate(callbackTimeStart);

        TimeStart = params.get("EndDate").replace("Z", " UTC");
        format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
        callbackTimeStart = format.parse(TimeStart);
        classroom.setEndDate(callbackTimeStart);

        classroom.setCourseId(Integer.parseInt(params.get("CourseId")));
        classroom.setTermType(Integer.parseInt(params.get("TermType")));
        classroom.setName(params.get("name"));
        classroom.setTestPerformanceWeight(new BigDecimal(params.get("testPerformanceWeight")));
        classroom.setDailyPerformanceWeight(new BigDecimal(params.get("dailyPerformanceWeight")));
        classroom.setStatus(1);

        classroom.setCreatedBy(teacherId);//如果传token了就可以直接用teacherId
        classroom.setCreatedOn(new Date());
        System.out.println(classroom);


        classroomMapper.insert(classroom);

        Integer classRoomId =   classroom.getId();

        List<ClassroomWork> classroomWorkList =  classroomWorkMapper.getClassroomWork(classroom.getCourseId());
        for (int i = 0; i <classroomWorkList.size() ; i++) {
            classroomWorkList.get(i).setClassroomId(classRoomId);
            classroomWorkList.get(i).setStatus(1);//需要知道布置作业对应的状态字典
            classroomWorkList.get(i).setCreatedOn(new Date());
            classroomWorkList.get(i).setCreatedBy(teacherId);
        }

        List<KnowledgeTest> knowledgeTestIds = knowledgeTestRepository.findAllByCourseId(classroom.getCourseId());
        ClassroomTestRelation classroomTestRelation = new ClassroomTestRelation();
        for (int i = 0; i < knowledgeTestIds.size(); i++) {
            classroomTestRelation.setClassroomId(classRoomId);
//            classroomTestRelation.setKnowledgeTestId(knowledgeTestIds.get(i).getId());

        }

        for (int i = 0; i <classroomWorkList.size() ; i++) {
            System.out.println(classroomWorkList.get(i));
        }
        if(!CollectionUtils.isEmpty(classroomWorkList))
            classroomWorkMapper.insertClassroomWorkList(classroomWorkList);
        return classRoomId;
    }

}
