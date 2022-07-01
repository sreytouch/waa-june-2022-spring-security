package com.example.waajune2022springsecurity.repository;

import com.example.waajune2022springsecurity.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
