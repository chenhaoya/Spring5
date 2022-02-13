/**
 * 开发团队：复仇者联盟
 * 开发团队领导人：陈浩
 * 开发人员姓名：陈浩
 * 学号/工号：2019112102
 * 个人/公司邮箱：ch111222@qq.com
 * 时间：2022/2/6 16:34
 * 开发名称：UserController
 * 开发工具：IntelliJ IDEA
 * 当前用户：CH
 * 描述：
 */
package com.ch.controller;

import com.ch.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/j1")//请求走视图解析器
    @ResponseBody//响应不走视图解析器，直返会字符串
    public String json() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("陈",11,"男");
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);
        return s;
    }
}