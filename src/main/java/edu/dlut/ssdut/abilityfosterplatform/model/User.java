package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class User {

    @Id
    private Integer id;

    private String password;

    private Integer status;

    private String username;

    private String loginAccount;

    private Date lastLoginTime;

    private String token;

    private Date tokenDeadline;

    private String mToken;

    private Date mTokenDeadline;

    private Boolean isCustomerService;

    private Boolean isDeleted;

    private Integer companyId;

    private Integer branchId;

    private String mobile;

    private String remark;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}