/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package edu.dlut.ssdut.abilityfosterplatform.oauth2;


import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;
import java.util.UUID;

/**
 * 认证
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {
    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;
    @Autowired
    UserService userService;

//    @Override
//    public boolean supports(AuthenticationToken token) {
//        return token instanceof OAuth2Token;
//    }

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权");
        return null;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        System.out.println("usernamePasswordToken.getUsername()"+usernamePasswordToken.getUsername());
        System.out.println("usernamePasswordToken" + usernamePasswordToken.getPassword());
        System.out.println("string" + usernamePasswordToken.getPassword().toString());
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setNumber(usernamePasswordToken.getUsername());
        loginInfo.setPassword(usernamePasswordToken.getPassword().toString());
        Teacher teacher = teacherService.selectByAccountAndPassword(loginInfo);
        if (teacher!=null){
            return new SimpleAuthenticationInfo(teacher, teacher.getPassword(), "");
        }
        System.out.println("执行认证");
        return null;
    }
}
