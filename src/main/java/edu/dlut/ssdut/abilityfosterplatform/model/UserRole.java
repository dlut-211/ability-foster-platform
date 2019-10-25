package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class UserRole {

    @Id
    private Integer id;

    private Integer roleId;

    private Integer userId;

    private Boolean isDeleted;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}