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

    private String code;

    private String name;

    private String subjectName;

    private String createdByName;

    private Date createdOn;

}
