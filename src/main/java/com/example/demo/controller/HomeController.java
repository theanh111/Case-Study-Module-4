package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/home")
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("index", "Welcome to My Page");
        return modelAndView;
    }
}
