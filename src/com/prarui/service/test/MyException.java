package com.prarui.service.test;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Administrator on 2017/8/14.
 * 异常增强
 */
public class MyException implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("异常通知");
    }


}
