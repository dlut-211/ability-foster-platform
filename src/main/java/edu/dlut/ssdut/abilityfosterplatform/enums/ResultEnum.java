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

    WORK_ID_IS_NULL(6, "作业ID为空"),

    CHAPTER_ID_IS_NULL(7, "章节ID为空"),

    ADD_TEST_PAPER_FAIL(10, "添加试卷失败"),

    ADD_TEST_PAPER_DETAIL_FAIL(11, "添加试卷详情失败"),

    SYSTEM_OPTION_NOT_FOUND(12, "SystemOption未找到"),

    KNOWLEDGE_NOT_FOUND(13, "知识点未找到"),

    COURSE_NOT_FOUND(14, "课程未找到"),

    ABILITY_NOT_FOUND(15, "课程未找到"),

    KNOWLEDGE_EXISTS(16, "知识点已存在"),

    KNOWLEDGE_EDIT_FAIL(17, "编辑知识点失败"),

    WORK_NOT_FOUND(18, "作业未找到"),

    CHAPTER_WORK_LIST_EMPTY(19, "当前章节作业列表不存在"),

    WORK_KNOWLEDGE_IS_EMPTY(20, "该作业下已不存在只知识点"),

    CHAPTER_WORK_EXISTS(21 , "章节下存在同名作业"),

    CHAPTER_WORK_EMPTY(22, "章节作业为空"),

    TEST_PAPER_NOT_FOUND(31, "试卷未找到"),

    TEACHER_NOT_FOUND(23, "教师未找到"),

    CHAPTER_NOT_FOUND(24, "章节未找到"),

    CHAPTER_EXISTS(25, "章节已存在"),

    CHAPTER_PARENT_NOT_EXIST(26, "父章节不存在")

    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
