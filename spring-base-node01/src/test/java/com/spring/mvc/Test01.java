package com.spring.mvc;

import com.spring.mvc.service.InfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class Test01 {

    @Autowired
    private InfoService infoService ;

    @Test
    public void test1 (){
        infoService.printName("cicada");
        System.out.println(infoService==infoService);
    }
}
