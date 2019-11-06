package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VChapterWorkList {

    private Integer courseId;

    private Integer chapterId;

    private String chapterName;

    private Integer classroomId;

    private Integer workId;

    private Integer status;

    private String workName;

    private Date layoutTime;

    private String description;

    private Integer id;

}