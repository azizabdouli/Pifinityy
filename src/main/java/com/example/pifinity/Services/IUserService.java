package com.example.pifinity.Services;

import com.example.pifinity.Entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(int id);
    User updateUser(int id, User newUser);
    void deleteUser(int id);
}