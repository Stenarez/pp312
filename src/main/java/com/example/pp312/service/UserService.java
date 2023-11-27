package com.example.pp312.service;


import com.example.pp312.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getListUsers();

    User findUser(int id);

}
