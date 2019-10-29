package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class VCompleteWork {

    private Integer courseId;

    private Integer classroomId;

    private Integer chapterId;

    private String chapterName;

    private Integer studentId;

    private Integer completeCount;

    private Integer studentWorkId;

}