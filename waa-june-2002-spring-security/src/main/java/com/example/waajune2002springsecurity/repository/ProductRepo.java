package com.example.waajune2002springsecurity.repository;

import com.example.waajune2002springsecurity.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
}
