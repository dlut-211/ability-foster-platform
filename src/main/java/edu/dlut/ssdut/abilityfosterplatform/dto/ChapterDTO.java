package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class ChapterDTO {

    private Integer id;

    private Integer chapterLevel;

    private Integer courseId;

    private String name;

    private Integer parentId;

    private String sort;

    private Integer number;

    private String description;

    private Integer createdBy;

    private String createdByName;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    private CourseDTO courseDTO;

}
