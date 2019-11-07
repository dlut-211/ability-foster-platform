package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: wdz
 * @Date: 2019/11/7 16:57
 * @Description:
 **/

@Entity
@Data
@Table(name = "v_school_teacher")
public class VSchoolTeacher {
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

    private String schoolName;

    private String subjectName;

}
