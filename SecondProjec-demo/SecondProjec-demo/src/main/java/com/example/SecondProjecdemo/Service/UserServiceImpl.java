package com.example.SecondProjecdemo.Service;

import com.example.SecondProjecdemo.Model.User;
import com.example.SecondProjecdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements  UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
