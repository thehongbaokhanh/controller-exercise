package com.example.controllerexercise.controller;

import com.example.controllerexercise.model.Product;
import com.example.controllerexercise.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}/edit")
    public String editProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/editProduct";
    }

    @PostMapping("/edit")
    public String editProduct(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("{id}/delete")
    public String deleteProduct(@PathVariable("id") int id) {
        productService.remove(id);
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("products", productService.searchProduct(keyword));
        return "/productList";
    }
}
