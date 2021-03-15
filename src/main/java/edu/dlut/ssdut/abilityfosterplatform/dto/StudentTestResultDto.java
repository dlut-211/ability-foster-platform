package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

@Data
public class StudentTestResultDto {
    int classroomId;
    Long knowledgeTestId;
    String name;
    String status;
    String knowledgeName;
    String rate;
}
