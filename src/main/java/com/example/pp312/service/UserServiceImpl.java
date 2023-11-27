package com.example.pp312.service;

import com.example.pp312.dao.UserDao;
import com.example.pp312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Transactional
    @Override
    public void updUser(User user) {
        userDao.updUser(user);
    }


    @Transactional
    @Override
    public void delUser(int id) {
        userDao.delUser(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User findUser(int id) {
        return userDao.findUser(id);
    }

}
