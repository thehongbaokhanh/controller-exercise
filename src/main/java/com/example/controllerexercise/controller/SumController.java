package com.example.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sum")
public class SumController {
    @GetMapping("")
    public String sum(@RequestParam int num1, @RequestParam int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "/sum";
    }
}
