package com.astrodust.springsecurity.service;

import com.astrodust.springsecurity.entity.User;
import com.astrodust.springsecurity.repository.UserRepository;
import com.astrodust.springsecurity.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
