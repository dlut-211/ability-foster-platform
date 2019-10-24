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

    ABILITY_ID_IS_NULL(2, "能力点ID为空"),

    COURSE_ID_IS_NULL(3, "课程ID为空"),

    SUBJECT_ID_IS_NULL(4, "学科ID为空"),

    KNOWLEDGE_ID_IS_NULL(5, "知识点ID为空"),

    ADD_TEST_PAPER_FAIL(10, "添加试卷失败"),

    ADD_TEST_PAPER_DETAIL_FAIL(11, "添加试卷详情失败"),

    SYSTEM_OPTION_NOT_FOUND(12, "SystemOption未找到"),

    KNOWLEDGE_NOT_FOUND(13, "知识点未找到"),

    COURSE_NOT_FOUND(14, "课程未找到"),

    ABILITY_NOT_FOUND(15, "课程未找到"),

    KNOWLEDGE_EXISTS(16, "知识点已存在"),

    KNOWLEDGE_EDIT_FAIL(17, "编辑知识点失败")

    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
