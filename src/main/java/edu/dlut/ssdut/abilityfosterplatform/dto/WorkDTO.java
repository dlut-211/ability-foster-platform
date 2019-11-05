package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/24 21:27
 * @Description:
 **/
@Data
public class WorkDTO {

    private Integer id;

    private String description;

    private Integer chapterId;

    /** 比 Work 多增加的属性 **/
    private List<Integer> knowledgeIdList;

    private String name;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;
}
