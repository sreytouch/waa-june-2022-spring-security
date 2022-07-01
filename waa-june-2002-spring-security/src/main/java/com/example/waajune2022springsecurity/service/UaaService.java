package com.example.waajune2022springsecurity.service;

import com.example.waajune2022springsecurity.entity.User;
import com.example.waajune2022springsecurity.model.LoginRequest;
import com.example.waajune2022springsecurity.model.LoginResponse;
import com.example.waajune2022springsecurity.model.RefreshTokenRequest;
import com.example.waajune2022springsecurity.model.UserResponse;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    UserResponse save(User user);
}
