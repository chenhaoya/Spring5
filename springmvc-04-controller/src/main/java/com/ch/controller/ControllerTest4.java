/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/5 22:10
 * 开发名称：ControllerTest4
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：restfull风格
 */
package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerTest4 {
    @RequestMapping(value = "/test/{a}/{b}",method = RequestMethod.POST)
    public String test4(@PathVariable int a,@PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg",result);
        return "hello1";
    }
    @RequestMapping(value = "/test/{a}/{b}",method = RequestMethod.GET)
    public String test41(@PathVariable String a,@PathVariable String b, Model model){
        String result = a + b;
        model.addAttribute("msg",result);
        return "hello1";
    }
}