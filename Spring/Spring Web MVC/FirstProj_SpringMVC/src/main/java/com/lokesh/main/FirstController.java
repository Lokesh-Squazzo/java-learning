package com.lokesh.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @GetMapping("/hellowPage")
    ModelAndView helloPage(){
        System.out.println("Reached");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @GetMapping("/hellow2Page")
    String hello2Page(){
//        ModelAndView modelAndView= new ModelAndView();
//        modelAndView.setViewName("hello2.jsp");
        return "hello2";
    }
}
