package edu.dlut.ssdut.abilityfosterplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :zjk
 * @Date :Create in 15:46 2020-08-10
 * @Description
 **/
@Controller
@RequestMapping("/api/shiro")
public class ShiroController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("shiro的登陆");
        return "redirect:http://localhost:8083";
    }
}
