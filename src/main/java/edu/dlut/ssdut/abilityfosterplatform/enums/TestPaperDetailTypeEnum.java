package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION:
 **/
@Getter
public enum TestPaperDetailTypeEnum implements CodeEnum {

    A(1,"A卷"),

    B(2,"B卷")

    ;

    private Integer code;
    private String message;

    TestPaperDetailTypeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
