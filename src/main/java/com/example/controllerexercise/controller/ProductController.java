package com.example.controllerexercise.controller;

import com.example.controllerexercise.model.Product;
import com.example.controllerexercise.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("")
        public String product(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/productList";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/addProduct";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        int count = productService.findAll().size() + 1;
        product.setId(count);
        productService.save(product);
        return "redirect:/product";
    }

}
