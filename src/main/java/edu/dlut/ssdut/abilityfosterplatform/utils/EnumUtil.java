package edu.dlut.ssdut.abilityfosterplatform.utils;

import edu.dlut.ssdut.abilityfosterplatform.enums.CodeEnum;

/**
 * @Author: raymond
 * @Date 2019/10/17 15:41
 * @Description:
 **/
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
