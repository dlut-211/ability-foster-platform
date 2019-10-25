package edu.dlut.ssdut.abilityfosterplatform.model;

import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperDetailTypeEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class TestPaperDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer detailNumber;

    private Integer score;

    private Integer testPaperId;

    private String title;

    /** 试卷详情类型 1 A卷 2 B卷 **/
    private Integer detailType = TestPaperDetailTypeEnum.A.getCode();

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}