package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperDetailTypeEnum;
import edu.dlut.ssdut.abilityfosterplatform.utils.EnumUtil;
import lombok.Data;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION: 试卷详情数据传输对象
 **/

@Data
public class TestPaperDetailDTO {

    private Integer id;

    /**  **/
    private Integer  detailNumber;

    /**  **/
    private Integer score;

    /**  **/
    private String title;

    /** 试卷详情类型 1 A卷 2 B卷 **/
    private Integer detailType;

    /** 试卷详情知识点 **/
    private List<TestPaperDetailKnowledgeDTO> knowledgeList;

    public TestPaperDetailTypeEnum getTestPaperDetailTypeEnum() {
        return EnumUtil.getByCode(detailType, TestPaperDetailTypeEnum.class);
    }

}
