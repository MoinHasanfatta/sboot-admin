package com.demo.authapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/home")
    public String home() {
        return "Welcome User!";
    }
}