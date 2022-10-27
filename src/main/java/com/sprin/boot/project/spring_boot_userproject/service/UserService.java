package com.sprin.boot.project.spring_boot_userproject.service;


import com.sprin.boot.project.spring_boot_userproject.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
