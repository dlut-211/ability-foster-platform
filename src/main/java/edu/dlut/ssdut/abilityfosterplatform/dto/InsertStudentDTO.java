package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.Date;
/**
 * @Author YuJunMing
 * @Date 2019/10/26 10:27
 * DESCRIPTION:
 */
@Data
public class InsertStudentDTO {

    private Integer classroomId ;

    private Integer studentId;

    private Integer createdBy;

    private Date creatOn;

    private String className;

    private String  email;

    private String  mobile;

    private String  name;

    private String  number;

    private Integer status;

    private String school;

    private String password;

}
