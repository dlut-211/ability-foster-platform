package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: wdz
 * @Date: 2019/11/5 8:59
 * @Description:
 **/
@Data
public class SchoolTeacherDTO {
    @Id
    private Integer id;

    private String email;

    private String name;

    private String number;

    private String token;

    private Integer status;

    private String password;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    private Integer subjectId;

    private Integer schoolId;

    private String subjectName;

    private String schoolName;
}
