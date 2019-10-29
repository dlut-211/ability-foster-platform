package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Company {

    @Id
    private Integer id;

    private String name;

    private String legalPerson;

    private String phone;

    private String region;

    private String address;

    private String remark;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}