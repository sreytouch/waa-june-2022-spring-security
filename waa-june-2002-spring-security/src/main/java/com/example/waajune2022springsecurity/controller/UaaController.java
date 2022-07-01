package com.example.waajune2022springsecurity.controller;

import com.example.waajune2022springsecurity.entity.User;
import com.example.waajune2022springsecurity.model.LoginRequest;
import com.example.waajune2022springsecurity.model.LoginResponse;
import com.example.waajune2022springsecurity.model.RefreshTokenRequest;
import com.example.waajune2022springsecurity.model.UserResponse;
import com.example.waajune2022springsecurity.service.UaaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/uaa")
@CrossOrigin
public class UaaController {

    private final UaaService uaaService;

    public UaaController(UaaService uaaService) {
        this.uaaService = uaaService;
    }

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        var loginResponse = uaaService.login(loginRequest);
        return ResponseEntity.ok().body(loginResponse);
    }

    @PostMapping("/refreshToken")
    public LoginResponse refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return uaaService.refreshToken(refreshTokenRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<UserResponse> signup(@RequestBody User user){
        UserResponse userResponse = uaaService.save(user);
        return ResponseEntity.ok(userResponse);
    }

}
