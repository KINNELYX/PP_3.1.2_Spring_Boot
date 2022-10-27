package com.sprin.boot.project.spring_boot_userproject.service;

import com.sprin.boot.project.spring_boot_userproject.entity.User;
import com.sprin.boot.project.spring_boot_userproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> allUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        usersRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> optional = usersRepository.findById(id);
        if (optional.isPresent()) {
            user = optional.get();
        }
        return user;
    }

    @Override
    public void deleteUser(int id) {
        usersRepository.deleteById(id);
    }
}
