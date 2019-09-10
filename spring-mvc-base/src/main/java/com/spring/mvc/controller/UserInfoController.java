package com.spring.mvc.controller;

import com.spring.mvc.entity.UserInfo;
import com.spring.mvc.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService ;

    @RequestMapping("/selectByPrimaryKey")
    public UserInfo selectByPrimaryKey (@RequestParam("id") Integer id){
        return userInfoService.selectByPrimaryKey(id) ;
    }

}
