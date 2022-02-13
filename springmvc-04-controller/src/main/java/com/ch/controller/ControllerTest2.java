/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/5 21:09
 * 开发名称：ControllerTest2
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 * 从实现Controller接口，到，通过注解处理前端请求，好处：解决了test1一个类只能处理一个请求的问题
 * 表达一个前端页面可以接收多个处理结果
 */
package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("t1")
    public String test1(Model model){
        model.addAttribute("msg","annotation");
        return "hello1";
    }
    @RequestMapping("t2")
    public String test2(Model model){
        model.addAttribute("msg","annotation1");
        return "hello1";
    }
}