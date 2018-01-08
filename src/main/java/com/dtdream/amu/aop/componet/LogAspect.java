package com.dtdream.amu.aop.componet;

import com.dtdream.amu.aop.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * commit
 * Author : amu
 * Date : 2017/11/28 0028.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.dtdream.amu.aop.annotation.Action)")
    public void annotionPointCut() {};

    @After("annotionPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("拦截式注解 " + action.name());
    }

    @Before("execution (* com.dtdream.amu.aop.service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截 " + method.getName());
    }
}
