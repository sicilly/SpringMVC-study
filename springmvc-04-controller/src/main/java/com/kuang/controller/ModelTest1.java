package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 结果跳转方式：
// 1. 设置ModelAndView对象 , 根据view的名称 , 和视图解析器跳到指定的页面

// 2. 通过设置ServletAPI , 不需要视图解析器 .
//        1、通过HttpServletResponse进行输出
//        2、通过HttpServletResponse实现重定向
//        3、通过HttpServletResponse实现转发

//@Controller
//public class ModelTest1 {
//    @RequestMapping("m1/t1")
//    public String test1(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session=request.getSession();
//        System.out.println(session.getId());
//        return "test";
//    }
//}

// 3. 通过SpringMVC来实现转发和重定向 - 无需视图解析器
@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test1(Model model){
        model.addAttribute("msg","ModelTest1");
        // 转发
//        return "/WEB-INF/jsp/test.jsp";
        // 转发二
//        return "forward:/WEB-INF/jsp/test.jsp";
        // 重定向
        return "redirect:/index.jsp";

    }
}