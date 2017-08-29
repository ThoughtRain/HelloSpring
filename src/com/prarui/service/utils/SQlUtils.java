package com.prarui.service.utils;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCountCallbackHandler;

/**
 * Created by Administrator on 2017/7/31.
 */
public class SQlUtils {
    /**
     * insert
     * select
     * update
     * delete
     */
    public static String INSERT = "insert\t";
    public static String SELECT = "select\t";
    public static String UPDATE = "update\t";
    public static String DELETE = "delete\t";
    public static String ALL = "*";

    /**
     * 插入数据；
     *
     * @param tableName
     * @param h
     * @return
     */
    public static String insertDate(String tableName, Object... h) {
        StringBuffer buffer = new StringBuffer();
        StringBuffer valueBuffer = new StringBuffer();
        for (int index = 0; index < h.length; index++) {
            buffer.append(h[index]);
            valueBuffer.append("?");
            if (index != h.length - 1) {
                buffer.append(",");
                valueBuffer.append(",");
            }
        }
        return INSERT + "\tinto\t" + tableName + "(" + buffer.toString() + ")\tvalues\t(" + valueBuffer.toString() + ")";
    }

    //   66

    public static int getRowCountNum(JdbcTemplate jdbcTemplate, String tableName, Object... h) {
        String sql = "select * from\t" + tableName;
        RowCountCallbackHandler callbackHandler = new RowCountCallbackHandler();
        jdbcTemplate.query(sql, callbackHandler);
        return callbackHandler.getRowCount();
    }

}
