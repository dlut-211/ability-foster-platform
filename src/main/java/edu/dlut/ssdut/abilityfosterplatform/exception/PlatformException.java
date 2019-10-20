package edu.dlut.ssdut.abilityfosterplatform.exception;

import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import lombok.Getter;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION:
 **/
@Getter
public class PlatformException extends RuntimeException {

    private Integer code;

    public PlatformException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public PlatformException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
