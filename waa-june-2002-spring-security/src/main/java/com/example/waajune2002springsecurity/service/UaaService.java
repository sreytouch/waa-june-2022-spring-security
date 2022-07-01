package com.example.waajune2002springsecurity.service;

import com.example.waajune2002springsecurity.entity.User;
import com.example.waajune2002springsecurity.model.LoginRequest;
import com.example.waajune2002springsecurity.model.LoginResponse;
import com.example.waajune2002springsecurity.model.RefreshTokenRequest;
import com.example.waajune2002springsecurity.model.UserResponse;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    UserResponse save(User user);
}
