package com.example.spingdatajpa.service;


import com.example.spingdatajpa.config.UserPrincipal;
import com.example.spingdatajpa.entity.authEntity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
