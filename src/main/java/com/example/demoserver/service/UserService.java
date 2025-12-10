package com.example.demoserver.service;

import com.example.demoserver.model.User;
import com.example.demoserver.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User getUserById(Integer id) {
        return repository.findById(id);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
