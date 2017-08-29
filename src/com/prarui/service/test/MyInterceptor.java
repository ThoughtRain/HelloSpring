package com.prarui.service.test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 2017/8/14.
 */
public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("==before==");
        String result=(String)invocation.proceed();
       System.out.println("==after==");
        return result;
    }
}
