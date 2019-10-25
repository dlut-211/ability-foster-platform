package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Author YuJunMing
 * @Date 2019/10/25 11:51
 * DESCRIPTION:
 */
@Data

public class ClassRoomListDTO {

    Integer id;
    Date beginDate;
    Date endDate;
    String courseCode;
    String courseDescribe;
    Integer courseId;
    String courseName;
    String courseSyllabusPath;
    Integer createdBy;
    String createdByName;
    Date createdOn;

    String name;

    Integer status;

    Integer termType;

    Float testPerformaceWeight;

    Float dailyPerformanceWeight;




    String statusName;//"已结课"
    String termTypeName;//"夏季学期"
    String dateFormat;//"2019-09-27 - 2019-09-30"


}
