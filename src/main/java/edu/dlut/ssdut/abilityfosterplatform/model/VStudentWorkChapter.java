package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.util.Date;

@Data
public class VStudentWorkChapter {

    private Integer courseId;

    private Integer classroomId;

    private String classRoomName;

    private Integer chapterId;

    private String chapterName;

    private Integer studentId;

    private String description;

    private String workName;

    private Integer score;

    private Date createdOnTime;

    private Integer studentWorkId;

    private Date layoutTime;

    private Integer isSubmit;

    private Boolean isScored;

    private Date endTime;

}