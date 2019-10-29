package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class VChapterWorkZjk {

    @Id
    private Integer id;
    
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
