package com.example31.__springBoot.service;


import com.example31.__springBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void add(User user);
    void update(User user);
    void delete(Long id);


}
