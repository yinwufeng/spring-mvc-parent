package com.spring.mvc.aspect;

/**
 * 书籍切面
 */
public class BookAspect {
    public void before (){
        System.out.println("Book Method Before ...");
    }
    public void after (){
        System.out.println("Book Method After ...");
    }
}
