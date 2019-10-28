package com.spring.mvc.config;

import com.spring.mvc.aspect.BookAspect;
import com.spring.mvc.service.BookService;
import com.spring.mvc.service.impl.BookServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookAopProxyFactory {
    public static BookService createService() {
        // 目标类
        final BookService bookService = new BookServiceImpl() ;
        // 切面类
        final BookAspect bookAspect = new BookAspect();
        /*
         * 代理类：将目标类（切入点）和 切面类（通知） 结合
         */
        BookService proxyBookService = (BookService) Proxy.newProxyInstance(
                BookAopProxyFactory.class.getClassLoader(),
                bookService.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        // 前执行
                        bookAspect.before();
                        // 执行目标类的方法
                        Object obj = method.invoke(bookService, args);
                        // 后执行
                        bookAspect.after();
                        return obj;
                    }
                });
        return proxyBookService ;
    }
}
