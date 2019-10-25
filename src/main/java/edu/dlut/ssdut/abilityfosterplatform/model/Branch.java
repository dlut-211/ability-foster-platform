package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Branch {

    @Id
    private Integer id;

    private String name;

    private String branchHead;

    private String headPhone;

    private String branchPhone;

    private String region;

    private String address;

    private String remark;

    private Integer companyId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}