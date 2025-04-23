package com.example.controllerexercise.controller;

import com.example.controllerexercise.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/model")
public class ModelController {
    Customer customer = new Customer(1, "Nguyen Van A", "7e2nI@example.com", "Ha Noi");
    Customer customer2 = new Customer(2, "Nguyen Van B", "7e2nI@example.com", "Ha Noi");
    Customer customer3 = new Customer(3, "Nguyen Van C", "7e2nI@example.com", "Ha Noi");

    @GetMapping("")
    public String model(Model model) {
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer2);
        customers.add(customer3);
        model.addAttribute("customers", customers);
        return "productList";
    }
}
