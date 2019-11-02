package edu.dlut.ssdut.abilityfosterplatform.dto;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import lombok.Data;


/**
 * @Author: wdz
 * @Date: 2019/11/2 14:43
 * @Description:
 **/
@Data
public class TestPaperABDTO {
    /** TestPaper 表中的 Id    **/
    private  Integer id;

    /** TestPaper 表中的 Name **/
    private String name;

    /** TestPaper 表中的 ClassRoomId **/
    private Integer classroomId;

    /** TestPaper 表中的 TestPaperType **/
    private Integer testPaperType;

    /** 试卷状态 1 尚未测试 2 已进行测试 **/
    private Integer status;

    /** A卷 **/
    private TestPaperDetail A;

    /** B卷 **/
    private TestPaperDetail B;
}
