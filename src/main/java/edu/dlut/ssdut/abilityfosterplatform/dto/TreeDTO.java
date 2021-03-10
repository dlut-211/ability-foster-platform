package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/10 15:54
 * @Description:
 */
@Data
public class TreeDTO {
    private Integer id;
    private Integer courseId;
    private Integer abilityId;
    private String name;
    private List<TreeDTO> children;
}
