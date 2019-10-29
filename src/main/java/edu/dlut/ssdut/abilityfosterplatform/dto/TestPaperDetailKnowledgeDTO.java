package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION: 试卷详情中的知识点列表
 **/
@Data
@AllArgsConstructor
public class TestPaperDetailKnowledgeDTO {

    /** TestPaperDetailKnowledge 表中的 KnowledgeId **/
    private Integer knowledgeId;

    /** TestPaperDetailKnowledge 表中的 Weight **/
    private BigDecimal weight;

}
