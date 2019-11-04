package edu.dlut.ssdut.abilityfosterplatform.utils;

import java.util.Random;

/**
 * @Author: raymond
 * @Date: 2019/10/28 9:11
 * @Description: 生成唯一的主键
 * 格式： 时间 + 随机数
 **/
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

}
