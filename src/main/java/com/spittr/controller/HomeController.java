package com.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dongmei.gao
 * @date 2019/5/24 10:20
 */
@Controller
public class HomeController {
    /**
     * 请求地址 http://localhost:8080/springmvcpractice/mvc/test
     * 1、tomcat地址+工程名字+RequestMapping，返回一个视图名字
     * 2、InternalResourceViewResolver视图解析器解析
     *
     * @return
     */

    @RequestMapping(value = "/mvc/test",method = RequestMethod.GET)
    public String homeMethod(){
        //返回视图名称
        return "home";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexMethod(){
        //返回视图名称
        return "index";
    }
}
