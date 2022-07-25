package com.astrodust.springsecurity.service.interfaces;

import com.astrodust.springsecurity.entity.User;

public interface UserService {
    User saveOrUpdate(User user);
    User findByUsername(String username);
}
