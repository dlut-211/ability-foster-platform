package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION: 试卷类型状态枚举类型
 **/
@Getter
public enum TestPaperStatusEnum implements CodeEnum {

    TEST_PAPER_UNEXAMINED(1,"尚未测试"),

    TEST_PAPER_EXAMINED(2,"考试完毕")

    ;

    private Integer code;
    private String message;

    TestPaperStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
