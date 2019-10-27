package edu.dlut.ssdut.abilityfosterplatform.converter;

import java.util.concurrent.TimeUnit;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION: 转换器 将秒数转化为 时-分-秒
 **/
public class TimeFormatConverter {
    public static String second2DHMS(Long seconds) {
        int day = (int)TimeUnit.SECONDS.toDays(seconds);
        long hour = TimeUnit.SECONDS.toHours(seconds) - (day * 24);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds) * 60);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) * 60);
        return day + "天" + hour + "小时" + minute + "分钟" + second + "秒";
    }
}
