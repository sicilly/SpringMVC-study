package com.kuang.controller;

import com.kuang.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 处理提交数据   http://localhost:8080/user/t1?username=111
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        // 1. 接收前端参数
        System.out.println("接收到前端参数为："+name);

        // 2. 将返回的结果传递给前端
        model.addAttribute("msg",name);

        // 3. 视图跳转
        return "test";
    }

//    前端提交的是一个对象：http://localhost:8080/user/t2?id=1&name=23&age=5
//    要求提交的表单域和对象的属性名一致，参数使用对象即可
    @GetMapping("t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

//    数据显示到前端：通过modelmap
    @GetMapping("t3")
    public String test3(@RequestParam("name") String name,ModelMap model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("name",name);
        System.out.println(name);
        return "test";
    }
}
