package com.example.controllerexercise.service.product;

import com.example.controllerexercise.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Laptop", 1000, 10));
        products.put(2, new Product(2, "Mobile", 2000, 20));
        products.put(3, new Product(3, "Tablet", 3000, 30));
        products.put(4, new Product(4, "Watch", 4000, 40));
        products.put(5, new Product(5, "Camera", 5000, 50));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }
}