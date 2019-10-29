package edu.dlut.ssdut.abilityfosterplatform.vo;

import lombok.Data;

/**
 * @Author: raymond
 * @Date 2019/10/16 10:29
 * @Description: 返回给前端的视图对象
 **/
@Data
public class ResultVO<T> {

    private Integer StatusCode;

    private String Message;

    private T data;
}
