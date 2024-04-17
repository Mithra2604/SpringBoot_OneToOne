package com.example.Springboot_OneToOne.service;

import com.example.Springboot_OneToOne.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Springboot_OneToOne.repository.UserRepository;

import java.util.List;

@Service
public class UserAppliction {
@Autowired
private UserRepository repository;
public List<User> getalluser()
    {
        return repository.findAll();
    }
 public User adduser(@RequestBody User user)
    {
        return repository.save(user);

    }
}
