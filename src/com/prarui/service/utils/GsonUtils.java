package com.prarui.service.utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/7/31.
 */
public class GsonUtils {
    public static String beanToJson(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }
}
