package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

/**
 * @Author: Wdz
 * @Date 2021/3/15 19:25
 * @Description: 课堂作业返回
 */
@Data
public class ClassTestDTO {
    private Long id;

    private String name;

    private String item1;

    private String item2;

    private String item3;

    private String item4;

    private String ans;

    private Integer knowledgeId;

    private String knowledgeName;

    private Integer chapterId;

    private Integer courseId;

    private Integer status;
}
