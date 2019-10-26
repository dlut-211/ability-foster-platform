package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.*;
import edu.dlut.ssdut.abilityfosterplatform.model.*;
import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomWork;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 9:43 2019-10-26
 * @Description 布置作业接口实现类
 **/
@Service
public class StudentWorkServiceImpl implements StudentWorkService {
    @Autowired
    private StudentWorkMapper studentWorkMapper;
    @Autowired
    private ClassroomWorkMapper classroomWorkMapper;
    @Autowired
    private ClassroomStudentMapper classroomStudentMapper;
    @Autowired
    private ClassroomMapper classroomMapper;
    @Autowired
    private StudentWorkDetailMapper studentWorkDetailMapper;

    @Transactional
    @Override
    public int layoutWork(Integer userId, Integer classroomWorkId, Date endTime) {
        ClassroomWork item1 = classroomWorkMapper.selectByPrimaryKey(classroomWorkId);
        if (item1 == null) {
            return 0;
        } else {
            Classroom classroom = classroomMapper.selectByPrimaryKey(item1.getClassroomId());
            Date date = new Date();
            if (classroom.getEndDate().compareTo(date) == -1) {
                return 200;
            } else {
                System.out.println(endTime);
                List<ClassroomStudent> classroomStudentList = classroomStudentMapper.selectByClassroomId(item1.getClassroomId());
                if (classroomStudentList == null) {
                    return 300;
                } else {
                    int i = 0;
                    item1.setStatus(2);
                    item1.setLayoutTime(endTime);
                    item1.setModifiedBy(userId);
                    item1.setModifiedOn(endTime);
                    item1.setEndTime(endTime);
                    System.out.println(item1);
                    classroomWorkMapper.updateByPrimaryKey(item1);
                    for (ClassroomStudent item : classroomStudentList) {
                        StudentWork studentWork = new StudentWork();
                        studentWork.setClassroomStudentId(item.getId());
                        studentWork.setClassroomWorkId(item1.getId());
                        studentWork.setCreatedBy(userId);
                        studentWork.setCreatedOn(endTime);
                        studentWork.setIsScored(false);
                        i = studentWorkMapper.insert(studentWork);
                        if (i!=1){
                            i=500;
                            break;
                        }
                        System.out.println("i=" + i);
                    }
                    return i;
                }
            }
        }
    }
    @Transactional
    @Override
    public int revokeLayoutWork(Integer classroomWorkId, Integer userId) {
        ClassroomWork item1 = classroomWorkMapper.selectByPrimaryKey(classroomWorkId);
        int i=0;
        if (item1 == null) {

        } else {
            item1.setStatus(1);
            item1.setLayoutTime(null);
            item1.setModifiedBy(userId);
            item1.setModifiedOn(new Date());
            item1.setEndTime(null);
            System.out.println(item1);
            classroomWorkMapper.updateByPrimaryKey(item1);
            List<StudentWork>studentWorkList=studentWorkMapper.selectByClassroomWorkId(classroomWorkId);
            for (StudentWork item : studentWorkList) {
                List<StudentWorkDetail> studentWorkDetailList = studentWorkDetailMapper.selectByStudentWorkId(item.getId());
                for (StudentWorkDetail studentWorkDetail : studentWorkDetailList) {
                    i=studentWorkDetailMapper.deleteByPrimaryKey(studentWorkDetail.getId());
                    if (i!=1){
                        i=500;
                        break;
                    }
                    System.out.println("第一个删除的i"+i);
                }
                i=studentWorkMapper.deleteByPrimaryKey(item.getId());
                if (i!=1){
                    i=500;
                    break;
                }
                System.out.println("第二个删除的i"+i);
            }
        }
        return i;
    }
}
