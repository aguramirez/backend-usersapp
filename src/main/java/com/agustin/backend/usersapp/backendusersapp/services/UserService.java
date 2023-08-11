package com.agustin.backend.usersapp.backendusersapp.services;

import java.util.List;
import java.util.Optional;

import com.agustin.backend.usersapp.backendusersapp.models.entities.User;

public interface UserService {
    
    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void remove(Long id);
}
