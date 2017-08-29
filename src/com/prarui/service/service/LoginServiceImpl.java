package com.prarui.service.service;

import com.prarui.service.base.BaseService;
import com.prarui.service.dao.LoginDao;
import com.prarui.service.model.UersBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Service
public class LoginServiceImpl implements BaseService<UersBean> {
    /**
     * 操作数据的地方；；
     */
    @Autowired
    private LoginDao dao;

    @Override
    public void saveData() {

    }

    @Override
    public List getQueryData(UersBean uersBean) {
        return dao.getAllDate();
    }

    @Override
    public void deleteData() {
    }

    @Override
    public void upData(UersBean uersBean) {
        dao.intData(uersBean);
    }
}
