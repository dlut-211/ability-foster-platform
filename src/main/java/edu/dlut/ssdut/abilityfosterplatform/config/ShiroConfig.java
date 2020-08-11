///**
// * Copyright (c) 2016-2019 人人开源 All rights reserved.
// *
// * https://www.renren.io
// *
// * 版权所有，侵权必究！
// */
//
//package edu.dlut.ssdut.abilityfosterplatform.config;
//
//
//
//import edu.dlut.ssdut.abilityfosterplatform.oauth2.OAuth2Realm;
//import org.apache.shiro.spring.LifecycleBeanPostProcessor;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.apache.shiro.mgt.SecurityManager;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * Shiro配置
// *
// * @author Mark sunlightcs@gmail.com
// */
//@Configuration
//public class ShiroConfig {
//
//    @Bean("securityManager")
//    public SecurityManager securityManager(OAuth2Realm oAuth2Realm) {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(oAuth2Realm);
//        securityManager.setRememberMeManager(null);
//        return securityManager;
//    }
//
//    @Bean("shiroFilter")
//    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
//        shiroFilter.setSecurityManager(securityManager);
//
//
//        Map<String, String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/api/imagecode/*", "authc");
////        filterMap.put("/api/teacher/selectByAccountAndPassword", "anon");
////        filterMap.put("/api/studentcontroller/selectByAccountAndPassword", "anon");
////        filterMap.put("/api/usercontroller/selectByAccountAndPassword", "anon");
////        filterMap.put("/api/shiro/login","anon");
//        //filterMap.put("/**", "authc");
//        //filterMap.put("localhost:8443/shiro/login", "anon");
//        shiroFilter.setLoginUrl("/api/shiro/login");
//        shiroFilter.setFilterChainDefinitionMap(filterMap);
//
//        return shiroFilter;
//    }
//
//    @Bean("lifecycleBeanPostProcessor")
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        return new LifecycleBeanPostProcessor();
//    }
//
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
//        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
//        advisor.setSecurityManager(securityManager);
//        return advisor;
//    }
//
//
//}
