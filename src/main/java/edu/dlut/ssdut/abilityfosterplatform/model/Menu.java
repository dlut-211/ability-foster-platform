package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Menu {

    @Id
    private Integer id;

    private String menuName;

    private String menuCode;

    private Integer menuType;

    private String icon;

    private String route;

    private Integer showOrder;

    private Integer parentId;

    private Integer menuStatus;

    private Boolean isDeleted;

    private Integer menuId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}