package com.example.Springboot_OneToOne.controller;

import com.example.Springboot_OneToOne.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Springboot_OneToOne.service.UserAppliction;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserAppliction service;

    @GetMapping("/getallusers")
    public List<User> getallusers() {
        return service.getalluser();
    }

    @PostMapping("/adduser")
    public User adduser(@RequestBody User user) {
        return service.adduser(user);
    }
}
