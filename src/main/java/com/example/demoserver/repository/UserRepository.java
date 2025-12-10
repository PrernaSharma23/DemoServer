package com.example.demoserver.repository;

import com.example.demoserver.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserRepository {
    private final Map<Integer, User> mockUsers = new HashMap<>();

    public UserRepository() {
    }

    @PostConstruct
    public void init() {
        mockUsers.put(1, new User(1, "Alice", "alice@example.com"));
        mockUsers.put(2, new User(2, "Bob", "bob@example.com"));
        mockUsers.put(3, new User(3, "Charlie", "charlie@example.com"));
    }

    public User findById(Integer id) {
        return mockUsers.get(id);
    }

    public List<User> findAll() {
        return new ArrayList<>(mockUsers.values());
    }
}
