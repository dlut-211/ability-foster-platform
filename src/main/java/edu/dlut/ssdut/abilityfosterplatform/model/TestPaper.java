package edu.dlut.ssdut.abilityfosterplatform.model;

import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperStatusEnum;
import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperTypeEnum;
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
public class TestPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer classroomId;

    /** 试卷状态 1 A卷 2 AB卷 **/
    private Integer testPaperType = TestPaperTypeEnum.A.getCode();

    /** 试卷状态 1 尚未测试 2 已进行测试 **/
    private Integer status = TestPaperStatusEnum.TEST_PAPER_UNEXAMINED.getCode();

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

}