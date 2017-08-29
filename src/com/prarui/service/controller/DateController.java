package com.prarui.service.controller;

import com.google.gson.Gson;
import com.prarui.service.dao.LoginDao;
import com.prarui.service.model.UersBean;
import com.prarui.service.base.RequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/7/15.
 * 发送Json字符串；
 *
 * @
 */

@Controller
@RequestMapping(value = "/data/times")
public class DateController {
    @Autowired
    private LoginDao dao;

    @ResponseBody
    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String sendJsonData(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "王瑞");
        map.put("age", "123");
        map.put("address", "四川成都");
        Gson gson = new Gson();
        List date = dao.getAllDate();
        RequestBean<UersBean> bean = new RequestBean<>();
        UersBean uersBean = new UersBean();
        uersBean.setName("王瑞");
        uersBean.setPassword("12333");
        bean.setCode("200");
        bean.setState("yes");
        bean.setData(uersBean);
        System.out.println(uersBean.getName());
        String callback = request.getParameter("callback");
        /**
         * 解决ajxax的跨界问题 返回的是jsonp数据；
         */
        if (callback != null) {
            return callback + "(" + gson.toJson(bean) + ");";
        }
        return gson.toJson(bean);

    }

}
