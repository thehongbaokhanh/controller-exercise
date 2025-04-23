package com.example.controllerexercise.controller;

import com.example.controllerexercise.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LogInController {
    User user = new User("admin", "admin@gmail.com", "admin");

    @GetMapping("")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "/logIn";
    }

    @PostMapping("")
    public String login(@ModelAttribute User user) {
        if (user.getUsername().equals(this.user.getUsername()) && user.getPassword().equals(this.user.getPassword())) {
            return "redirect:/signup/infor";
        } else {
            return "/error";
        }
    }
}
