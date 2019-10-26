package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/25 19:15
 * @Description:
 **/
@Data
public class ChapterTreeDTO {

    private Integer id;

    private String name;

    private Integer chapterLevel;

    private Integer parentId;

    private String description;

    private Boolean expand = false;

    private String sort;

    private List<ChapterTreeDTO> children;

}
