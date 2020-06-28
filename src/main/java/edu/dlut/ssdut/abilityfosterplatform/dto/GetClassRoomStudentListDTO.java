package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 10:15 2020-06-28
 * @Description
 **/
@Data
public class GetClassRoomStudentListDTO {
    List<ClassRoomStudentListDTO> list;
    Integer total;
}
