package com.example.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/link")
public class LinkController {
    @GetMapping("{link}")
    public String link(@PathVariable("link") String link , Model model) {
        model.addAttribute("link", link);
        return "/link";
    }
}
