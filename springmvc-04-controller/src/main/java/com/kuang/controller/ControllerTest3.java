package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller注解的类会自动添加到Spring上下文中
@Controller
@RequestMapping("/c3") // 表示类中的所有响应请求的方法都是以该地址作为父路径
public class ControllerTest3 {

    //映射访问路径
    @RequestMapping("/t1")
    public String test2(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest3");
        //返回视图位置
        return "test";
    }


}