package com.prarui.service.base;

/**
 * Created by prarui on 2017/7/27.
 */
public class RequestBean<T> {
    String code;
    String state;
    T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
