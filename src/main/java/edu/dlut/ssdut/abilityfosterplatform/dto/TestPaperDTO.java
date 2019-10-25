package edu.dlut.ssdut.abilityfosterplatform.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperStatusEnum;
import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperTypeEnum;
import edu.dlut.ssdut.abilityfosterplatform.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;
import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION: 试卷的数据传输对象
 **/

@Data
@DynamicUpdate
public class TestPaperDTO {

    /** TestPaper 表中的 Name **/
    private String name;

    /** TestPaper 表中的 ClassRoomId **/
    private Integer classroomId;

    /** TestPaper 表中的 TestPaperType **/
    private Integer testPaperType;

    /** 试卷状态 1 尚未测试 2 已进行测试 **/
    private Integer status;

    /** A卷 **/
    private List<TestPaperDetailDTO> A;

    /** B卷 **/
    private List<TestPaperDetailDTO> B;

    @JsonIgnore
    public TestPaperStatusEnum getTestPaperStatusEnum() {
        return EnumUtil.getByCode(status, TestPaperStatusEnum.class);
    }

    @JsonIgnore
    public TestPaperTypeEnum getTestPaperTypeEnum() {
        return EnumUtil.getByCode(testPaperType, TestPaperTypeEnum.class);
    }

}
