package com.spring.mvc.config;

import com.spring.mvc.aspect.BookAspect;
import com.spring.mvc.service.BookService;
import com.spring.mvc.service.impl.BookServiceImpl;
import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class BookAopCgLibFactory {
    public static BookService createService() {
        // 目标类
        final BookService bookService = new BookServiceImpl() ;
        // 切面类
        final BookAspect bookAspect = new BookAspect();
        // 核心代理类
        Enhancer enhancer = new Enhancer();
        // 确定父类
        enhancer.setSuperclass(bookService.getClass());
        // 设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method,
                                    Object[] args,
                                    MethodProxy methodProxy) throws Throwable {
                bookAspect.before();
                Object obj = method.invoke(bookService, args);
                bookAspect.after();
                return obj;
            }
        });
        BookServiceImpl proxyService = (BookServiceImpl) enhancer.create();
        return proxyService ;
    }
}
