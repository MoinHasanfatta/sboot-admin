package com.demo.authapp.dto;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String role;  // "ROLE_ADMIN" or "ROLE_USER"
}
