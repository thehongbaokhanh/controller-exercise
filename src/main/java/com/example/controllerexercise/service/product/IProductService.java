package com.example.controllerexercise.service.product;
import com.example.controllerexercise.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);
}
