package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Teacher {

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

}