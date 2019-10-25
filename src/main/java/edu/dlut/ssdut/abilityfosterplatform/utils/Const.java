package edu.dlut.ssdut.abilityfosterplatform.utils;

import javax.servlet.http.HttpServletRequest;

public class Const {

    public static String getUserName(HttpServletRequest request) {
        String name = (String) request.getSession().getAttribute("username");
        return name;
    }

}
