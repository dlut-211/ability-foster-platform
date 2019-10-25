package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Student {

    @Id
    private Integer id;

    private String className;

    private String email;

    private String mobile;

    private String name;

    private String number;

    private String qq;

    private String token;

    private Integer status;

    private String school;

    private String password;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}
