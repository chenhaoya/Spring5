/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/6 10:23
 * 开发名称：UserController
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：用于测试前端传对象
 */
package com.ch.controller;

import com.ch.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test1(@RequestParam("username")String name, Model model){
        model.addAttribute("msg",name);
        return "hello1";
    }
    @RequestMapping("/t2")
    public String test2(User user,Model model){
        System.out.println(user);
        return "hello1";
    }
}