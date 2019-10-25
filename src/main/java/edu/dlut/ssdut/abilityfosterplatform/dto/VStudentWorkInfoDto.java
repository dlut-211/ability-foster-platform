package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class VStudentWorkInfoDto {
    private Integer studentId;
    private int nowPage;
    private int pageSize;
    private int startSize;
}
