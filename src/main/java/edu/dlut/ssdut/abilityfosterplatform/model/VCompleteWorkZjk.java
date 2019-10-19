package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class VCompleteWorkZjk {

    private Integer studentId;

    private Integer classroomId;

    private Integer courseId;

    private String courseName;

    private Integer chapterId;

    private String chapterName;

    private Long workCount;

    private String classroomName;

}