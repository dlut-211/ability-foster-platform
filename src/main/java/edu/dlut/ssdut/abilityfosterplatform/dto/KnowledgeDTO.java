package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import lombok.Data;

import java.util.Date;

/**
 * @Author: raymond
 * @Date: 2019/10/23 21:23
 * @Description:
 **/
@Data
public class KnowledgeDTO {

    private Integer id;

    private String name;

    private Integer courseId;

    private Integer abilityId;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    /** 以上为与 Knowledge 共有属性 可以直接进行属性拷贝 **/
    /** ----------------------------------------- **/

    /** selectId 不知暂不知有何作用 设计外键的id均范围其对应的对象 **/
    private Integer selectId;

    private Course course;

    private Ability ability;

    private SystemOption systemOption;

}
