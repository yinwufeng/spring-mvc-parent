package com.spring.mvc.test;

import com.spring.mvc.service.UserAccountService02;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx_Test_04 {

    @Test
    public void test1 (){
        String xmlPath = "spring-jdbc-tx-04.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserAccountService02 accountService = (UserAccountService02)
                                    context.getBean("userAccountService02");
        accountService.remittance("jack","tom",1000);
    }
}
