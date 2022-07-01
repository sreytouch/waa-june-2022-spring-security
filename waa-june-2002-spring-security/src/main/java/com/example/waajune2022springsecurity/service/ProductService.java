package com.example.waajune2022springsecurity.service;


import com.example.waajune2022springsecurity.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
