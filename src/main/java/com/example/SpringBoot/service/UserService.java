package com.example.SpringBoot.service;



import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveOrUpdateUser (User user);
    void deleteUser(long id);
    User getUser(long id);
}
