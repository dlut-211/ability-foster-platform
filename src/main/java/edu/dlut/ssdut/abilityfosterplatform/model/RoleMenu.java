package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class RoleMenu {

    @Id
    private Integer id;

    private Integer menuId;

    private Integer roleId;

    private Boolean isDeleted;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}