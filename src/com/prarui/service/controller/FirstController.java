package com.prarui.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/29.
 */
@Controller
@RequestMapping("/*")
public class FirstController {
    @RequestMapping(value = "/index")
    public String login(HttpServletRequest request, HttpServletResponse response){

        return "dome";
    }
}
