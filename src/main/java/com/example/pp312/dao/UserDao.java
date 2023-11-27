package com.example.pp312.dao;


import com.example.pp312.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getListUsers();

    User findUserById(int id);
}
