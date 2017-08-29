package com.prarui.service.dao;

import com.prarui.service.base.BaseDao;
import com.prarui.service.model.UersBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/7/15.
 */
@Repository
public class LoginDao implements BaseDao<UersBean> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List getAllDate() {
        String sql = "select * from table_uers";
        List map = jdbcTemplate.queryForList(sql);
        return map;
    }

    public boolean intData(UersBean uersBean) {
        String sql = "insert into table_uers(uers,password) values (?,?)";
        int i = jdbcTemplate.update(sql, uersBean.getName(), uersBean.getPassword());
        if (i == 1) {
            return true;
        }
        return false;
    }


    @Override
    public void save(UersBean entity) {

    }

    @Override
    public void update(UersBean entity) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public UersBean findById(Serializable id) {
        return null;
    }
}
