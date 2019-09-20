package com.spring.mvc;

import com.spring.mvc.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConfig.class)
public class Test03 {

    @Autowired
    private UserInfo userInfo ;

    @Autowired
    private UserInfo userInfo1 ;

    @Test
    public void test1 (){
        /*
         * userInfo...
         * true
         */
        System.out.println(userInfo==userInfo1);
    }
}
