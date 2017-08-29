package com.prarui.service.test;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/14.
 */
public class MethodBeforeAdvice implements org.springframework.aop.MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("==before==");
    }
}
