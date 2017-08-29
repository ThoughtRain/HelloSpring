package com.prarui.service.base;

import java.io.Serializable;

/**
 * Created by prarui on 2017/7/17.
 */
public interface BaseDao<T> {
    q
    public void save(T entity);

    public void update(T entity);

    public void delete(Serializable id);

    public T findById(Serializable id);


}
