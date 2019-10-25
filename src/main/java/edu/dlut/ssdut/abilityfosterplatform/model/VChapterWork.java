package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

@Data
public class VChapterWork {

    private Integer courseId;

    private String courseName;

    private Integer classroomId;

    private String classroomName;

    private Integer chapterId;

    private String chapterName;

    private Integer studentId;

    private Long completeCount;

    private Long workCount;

}