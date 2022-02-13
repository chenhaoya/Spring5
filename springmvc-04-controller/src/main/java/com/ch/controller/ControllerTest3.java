/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/5 21:26
 * 开发名称：ControllerTest3
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：测试@RequestMapping 写在类上和写在方法上的区别
 *
 */
package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test3")
public class ControllerTest3 {
    @RequestMapping("t1")
    public String test(Model model){
        model.addAttribute("msg",this.getClass().getName());
        return "hello1";
    }
}