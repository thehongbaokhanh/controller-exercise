package com.example.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/name")
public class NameController {
    @GetMapping("")
    public String name(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "/name";
    }
}
