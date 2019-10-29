package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class VTestPaperDetail {

    @Id
    private Integer id;

    private Integer detailNumber;

    private Integer score;

    private Integer testPaperId;

    private String title;

    private Integer detailType;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    @Column(name = "name_exp_12")
    private String nameExp12;

}