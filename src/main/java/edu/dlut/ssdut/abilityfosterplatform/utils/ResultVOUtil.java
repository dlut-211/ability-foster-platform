package edu.dlut.ssdut.abilityfosterplatform.utils;

import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;

/**
 * @Author: raymond
 * @Date 2019/10/16 10:32
 * @Description: HTTP返回对象工具类
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setStatusCode(1);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setStatusCode(code);
        resultVO.setMessage(msg);
        return resultVO;
    }
}
