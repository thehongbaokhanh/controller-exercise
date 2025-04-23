package com.example.controllerexercise.controller;

import com.example.controllerexercise.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignUpController {
    @GetMapping("")
    public String signUp(Model model) {
        model.addAttribute("user", new User());
        return "/signUp";
    }
    @PostMapping ("/save")
    public String logout(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "/userInfor";
    }
}
