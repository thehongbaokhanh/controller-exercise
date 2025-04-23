package com.example.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mav")
public class MAVController {

    @GetMapping("")
    public ModelAndView showHelloPage() {
        ModelAndView mav = new ModelAndView("/mav");
        mav.addObject("name", "Khanh");
        mav.addObject("message", "Chào mừng bạn đến với Spring MVC!");
        return mav;
    }
}
