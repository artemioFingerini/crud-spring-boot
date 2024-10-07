package com.example.kata.crud_spring_boot.dao;



import com.example.kata.crud_spring_boot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(User user);

    void update(User user);

}
