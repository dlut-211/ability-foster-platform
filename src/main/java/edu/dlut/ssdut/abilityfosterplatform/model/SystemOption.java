package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class SystemOption {

    @Id
    private Integer id;

    private String optionCode;

    private String optionValue;

    private String optionType;

    private String optionTypeName;

    private Integer showOrder;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}