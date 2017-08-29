package com.prarui.service;

import java.lang.reflect.Field;

/**
 * 注解；
 * Created by Administrator on 2017/8/10.
 */
public class ZhujieInt {
    public static void inidata(Class c) {
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field : declaredFields) {
            Zhujie zhujie = field.getAnnotation(Zhujie.class);
            if (zhujie != null) {
                String zhujieValue = zhujie.value();
                field.setAccessible(true);
                try {
                    field.set(c, zhujieValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.print(zhujieValue);

            }
        }
    }

}
