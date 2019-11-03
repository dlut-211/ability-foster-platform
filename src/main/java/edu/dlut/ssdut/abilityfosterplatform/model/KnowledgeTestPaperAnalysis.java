package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class KnowledgeTestPaperAnalysis {
    /** 知识点名字 **/
    String knowledgeName;

    /**    >=80%   **/
    double level_1;

    /**80% ~ 40%  **/
    double level_2;

    /**    <40%   **/
    double level_3;

    /**知识点总分  **/
    double score_sum;
}
