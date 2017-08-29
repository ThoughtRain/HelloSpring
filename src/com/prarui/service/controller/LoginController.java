package com.prarui.service.controller;

import com.prarui.service.model.UersBean;
import com.prarui.service.utils.GsonUtils;
import com.prarui.service.service.LoginServiceImpl;
import com.prarui.service.utils.SQlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/15
 * http://192
 */
@Controller  //表明是一个Controller
@RequestMapping(value = "/login")//自动显示Controller所在的位置
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/value", method = RequestMethod.GET)
    public String stringMap(ModelMap model) {
        model.addAttribute("name", "王瑞");
        model.addAttribute("123456");
        return "login";
    }

    @RequestMapping(value = "/dome", method = RequestMethod.GET)
    public String stringDome() {
        String fileName = "dome";
        return fileName;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String stringLogin(@RequestParam(value = "uersname", required = false) String uersname, @RequestParam(value = "password", required = false) String password, ModelMap model) {
        System.out.println("姓名：" + uersname + "\n" + "密码：" + password);
        return "login";
    }

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    @ResponseBody
    public String ssss() {
        UersBean bean = new UersBean();
        bean.setPassword("12345");
        bean.setName("xxxx");
        loginService.upData(bean);
        return GsonUtils.beanToJson(loginService.getQueryData(bean));
    }

    @Autowired
    JdbcTemplate template;

    @RequestMapping(value = "/fenye", method = RequestMethod.GET)
    public void fenYe(@RequestParam(value = "page", required = true, defaultValue = "1") String page, HttpServletResponse response) {
        /**
         * (1)首先把总共的数据；
         * （2）得到page的数据
         */
        int rowCountNum = SQlUtils.getRowCountNum(template, "table_uers", "x");
        System.out.println("page:" + page + "rowCountNum:" + rowCountNum);
    }


}
