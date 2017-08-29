package com.prarui.service.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by prarui on 2017/7/25.
 * 常量解析
 */
public class BaseConfigUtils {
    private static Properties properties = new Properties();

    public static String getValue(String key) {
        String path = Thread.currentThread().getContextClassLoader().getResource("BaseConfig.properties").getPath();
        try {
            properties.load(new FileInputStream(path));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key, "null");
    }


}
