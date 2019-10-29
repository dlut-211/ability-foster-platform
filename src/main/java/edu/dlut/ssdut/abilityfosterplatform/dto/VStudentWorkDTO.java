package edu.dlut.ssdut.abilityfosterplatform.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
@Data
public class VStudentWorkDTO {

    private Integer id;

    private Integer classroomStudentId;

    private Integer score;

    private String workMessage;

    private Integer classroomWorkId;

    private String studentNumber;

    private String studentName;

    private Date submitTime;

    private Long useTime;

    private String useTimeFormat;

    private Integer submitCount;

    private Integer isSubmit;

    @JsonIgnore
    private String workPath;

}
