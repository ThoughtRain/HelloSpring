package com.prarui.service.base;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface BaseService<T> {
    void saveData();

    List getQueryData(T t);

    void deleteData();

    void upData(T t);


}
