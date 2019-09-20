package com.spring.mvc;

import com.spring.mvc.entity.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该方式在SpringBoot的配置中十分常见
 */
@Configuration // 配置类注解
public class UserConfig {

    @Bean
    public UserInfo userInfo (){
        System.out.println("userInfo...");
        return new UserInfo() ;
    }

}
