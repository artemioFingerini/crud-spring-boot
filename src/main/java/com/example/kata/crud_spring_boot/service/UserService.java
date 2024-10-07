package com.example.kata.crud_spring_boot.service;

import com.example.kata.crud_spring_boot.model.User;
import jakarta.validation.Valid;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getById(Long id);

    void saveUser(@Valid User user);

    void deleteUserById(Long id);

    void updateUser(User user);
}
