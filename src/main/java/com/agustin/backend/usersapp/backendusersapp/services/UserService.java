package com.agustin.backend.usersapp.backendusersapp.services;

import java.util.List;
import java.util.Optional;

import com.agustin.backend.usersapp.backendusersapp.models.UserRequest;
import com.agustin.backend.usersapp.backendusersapp.models.entities.User;

public interface UserService {
    
    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    Optional<User> update(UserRequest user, Long id);

    void remove(Long id);
}
