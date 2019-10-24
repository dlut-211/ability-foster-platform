package edu.dlut.ssdut.abilityfosterplatform.enums;

import lombok.Getter;

/**
 * @Author: raymond
 * @Date 2019/10/17 15:36
 * @Description: 返回结果枚举类
 **/
@Getter
public enum ResultEnum {

    SUCCESS(0, "成功"),

    ERROR(1, "失败"),

    ADD_TEST_PAPER_FAIL(10, "添加试卷失败"),

    ADD_TEST_PAPER_DETAIL_FAIL(11, "添加试卷详情失败"),

    SYSTEM_OPTION_NOT_FOUND(12, "SystemOption未找到")

    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
