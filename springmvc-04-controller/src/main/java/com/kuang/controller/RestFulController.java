package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


// 原来的：   http://localhost:8080/add?a=1&b=2
//@Controller
//public class RestFulController {
//    @RequestMapping("/add")
//    public String test1(int a, int b, Model model){
//        int res=a+b;
//        model.addAttribute("msg","结果为"+res);
//        return "test";
//    }
//}


// restful:   http://localhost:8080/add/1/2
// 同一个地址 不同的访问方式展现不同的结果

@Controller
public class RestFulController{
    @RequestMapping(value="/add/{a}/{b}",method= RequestMethod.GET)
//    @GetMapping("/add/{a}/{b}")  // 通过get访问
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","get结果为："+res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")  // 通过表单post提交
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","post结果为："+res);
        return "test";
    }
}
