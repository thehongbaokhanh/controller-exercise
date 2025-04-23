package com.example.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/time")
public class TimeController {
    @GetMapping("")
    public String time(Model model) {
        LocalDateTime localDate = LocalDateTime.now();
        model.addAttribute("time", localDate);
        return "/time";
    }
}
