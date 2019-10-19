package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VChapterWorkZjk {

    private Integer studentId;

    private Integer classroomId;

    private Integer courseId;

    private String courseName;

    private Integer chapterId;

    private String chapterName;

    private Long workCount;

    private String classroomName;

    private BigDecimal completeCount;

}