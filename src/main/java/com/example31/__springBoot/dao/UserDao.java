package com.example31.__springBoot.dao;


import com.example31.__springBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findById(Long id);

    void add(User user);

    void update(User user);

    void delete(Long id);

}
