package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Integer id;

    private String code;

    private String name;

    private String syllabus;

    private String syllabusPath;

    private String description;

    private Integer subjectId;

    private Integer createdBy;

    private String subjectName;

    private String createdByName;

    private Date createdOn;

    private SystemOption systemOption;

}
