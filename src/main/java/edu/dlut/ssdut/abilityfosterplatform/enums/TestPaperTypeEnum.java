package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION:
 **/
@Getter
public enum TestPaperTypeEnum implements CodeEnum {

    A(1,"A卷"),

    AB(2,"AB卷")

    ;

    private Integer code;
    private String message;

    TestPaperTypeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

}
