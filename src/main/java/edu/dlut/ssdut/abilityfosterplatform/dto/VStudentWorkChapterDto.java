package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class VStudentWorkChapterDto {
    /*
    学生查看作业
     */
    private Integer studentId;
    private Integer chapterId;
    private Integer classroomId;
    private int nowPage;
    private int pageSize;


}
