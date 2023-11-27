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
    public void updateUser(User user) {
        userDao.updateUser(user);
    }


    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<User> getListUsers() {
        return userDao.getListUsers();
    }

    @Override
    public User findUser(int id) {
        return userDao.findUserById(id);
    }

}
