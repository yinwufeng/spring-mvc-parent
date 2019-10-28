package com.spring.mvc.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthorAopAspectJ {
    @Pointcut("execution(* com.spring.mvc.service.impl.AuthorServiceImpl.*(..))")
    private void myPointCut(){
    }
    @Before("execution(* com.spring.mvc.service.impl.AuthorServiceImpl.*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知：" + joinPoint.getSignature().getName());
    }
    @AfterReturning(value="myPointCut()" ,returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知：" +
                joinPoint.getSignature().getName() + " , -->" + ret);
    }
    @Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕通知前");
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知前后");
        return obj;
    }
    @AfterThrowing(
            value="execution(* com.spring.mvc.service.impl.AuthorServiceImpl.*(..))",
            throwing="e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }
}
