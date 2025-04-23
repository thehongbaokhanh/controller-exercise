package com.example.controllerexercise.service.product;
import com.example.controllerexercise.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void remove(int id);
    List<Product> searchProduct(String keyword);
}
