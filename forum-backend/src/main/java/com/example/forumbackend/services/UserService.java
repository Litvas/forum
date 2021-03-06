package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.domain.Theme;
import com.example.forumbackend.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        if (user.getId() == null) user.setId(new Random().nextInt());
        users.add(user);
    }

    public User getUserById(Integer id) {
        return users.stream()
                .filter(entry -> entry.getId().equals(id))
                .findFirst()
                .orElse(new User());
    }

}
