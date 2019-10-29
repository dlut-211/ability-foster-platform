package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.model.WorkKnowledge;
import lombok.Data;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/24 17:10
 * @Description:
 **/
@Data
public class ChapterWorkDTO {

    private Integer id;

    private String description;

    private Integer chapterId;

    private String name;

    private List<WorkDTO> workDTOList;

    private List<Integer> knowledgeIdList;

    private List<Integer> workIdList;
}
