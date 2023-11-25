package com.example.pp312.dao;

//import web.model.User;

import com.example.pp312.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updUser(User user);
    void delUser(int id);

    List<User> listUsers();

    User findUser(int id);
}
