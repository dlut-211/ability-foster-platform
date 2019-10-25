package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VStudentChapterCompleteWork {

    private Integer classroomId;

    private Integer courseId;

    private String classroomName;

    private String courseName;

    private Integer chapterId;

    private String chapterName;

    private BigDecimal completeWork;

    private Integer studentId;

}