/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/5 19:58
 * 开发名称：ControllerTest1
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：实现Controller接口，对应springmvc-config1.xml 原始的写法
 */
package com.ch.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello");
        mv.setViewName("hello1");
        return mv;
    }
}