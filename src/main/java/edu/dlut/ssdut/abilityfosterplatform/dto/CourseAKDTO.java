package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/10 14:29
 * @Description: 树形展示  课程 -> 能力点 -> 知识点
 */
@Data
public class CourseAKDTO implements Serializable {

    private String pName;

    private String aName;

    private BigDecimal abilityScore;

    private BigDecimal knowledgeScore;

    private Integer id;

    private String name;

    private Integer courseId;

    private Integer abilityId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    private List<CourseAKDTO> children;


}
