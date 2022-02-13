/*
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/8 21:36
 * 开发名称：AjaxController
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.controller;

import com.ch.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CH
 */
@RestController
public class AjaxController {

    @RequestMapping("/t")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("aq:param:==>" + name);
        String ch = "ch";
        if (ch.equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("ch1", 1, "男"));
        userList.add(new User("ch2", 1, "女"));
        userList.add(new User("ch3", 1, "男"));
        return userList;
    }

    @RequestMapping("u1")
    public String u1(String name11, String pwd11) {
        String userId = "admin";
        String userPwd = "123";
        String msg = "";
        if (name11 != null) {
            if (userId.equals(name11)) {
                msg = "ok";
            } else {
                msg = "用户名有误";
            }
        }
          if (pwd11 != null) {
            if (userPwd.equals(pwd11)) {
                msg = "ok";
            } else {
                msg = "密码名有误";
            }
        }
        return msg;
    }
}