package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @Author: raymond
 * @Date 2019/10/17 16:02
 * @Description:
 **/
@Getter
public enum TermTypeEnum implements CodeEnum {

    SPRING(1,"春季学期"),
    SUMMER(2,"夏季学期"),
    AUTUMN(3,"秋季学期")
    ;

    private Integer code;
    private String message;

    TermTypeEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
