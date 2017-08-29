package com.prarui.service.test;

/**
 * Created by Administrator on 2017/8/14.
 */
public class AdviceImpl implements Advice {
    @Override
    public void firstMethed() {
        System.out.println("==firstMethod==");
    }

    @Override
    public String secondMethed() {
        System.out.println("==secondMethod==");
        return "abc";

    }
}
