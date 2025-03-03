package com.example31.__springBoot.service;

import com.example31.__springBoot.dao.UserDao;
import com.example31.__springBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }


    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
