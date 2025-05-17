package com.example.Usuario.service;

import com.example.Usuario.model.User;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, User> userMap = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public User addUser(User user) {
        long id = idCounter.incrementAndGet();
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    public User updateUser(Long id, User user) {
        if (userMap.containsKey(id)) {
            user.setId(id);
            userMap.put(id, user);
            return user;
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        return userMap.remove(id) != null;
    }

}

