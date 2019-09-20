package com.spring.mvc.service.impl;

import com.spring.mvc.service.InfoService;
import org.springframework.stereotype.Component;

@Component("infoService") // 组件类，Spring框架会为该类创建Bean
public class InfoServiceImpl implements InfoService {
    @Override
    public void printName(String name) {
        System.out.println("Name："+name);
    }
}
