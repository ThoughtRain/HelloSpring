package com.prarui.service.test;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/14.
 */
public class AfterReturningAdvice implements org.springframework.aop.AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("==After==");
    }
}
