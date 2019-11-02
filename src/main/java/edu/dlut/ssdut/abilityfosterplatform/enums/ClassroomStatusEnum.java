package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2019/11/2 - 10:29
 * DESCRIPTION:
 **/
@Getter
public enum ClassroomStatusEnum implements CodeEnum {

    NOT_AVAILABLE(1, "尚未课程"),

    BEGUN(2, "课程已开始"),

    CLOSED(4, "课程已结束")

    ;

    private Integer code;

    private String message;

    ClassroomStatusEnum(Integer code, String message) {
       this.code = code;
       this.message = message;
    }

}
