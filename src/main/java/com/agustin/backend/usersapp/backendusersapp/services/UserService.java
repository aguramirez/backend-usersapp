package com.agustin.backend.usersapp.backendusersapp.services;

import java.util.List;
import java.util.Optional;

import com.agustin.backend.usersapp.backendusersapp.models.UserRequest;
import com.agustin.backend.usersapp.backendusersapp.models.dto.UserDto;
import com.agustin.backend.usersapp.backendusersapp.models.entities.User;

public interface UserService {
    
    List<UserDto> findAll();

    Optional<UserDto> findById(Long id);

    UserDto save(User user);

    Optional<UserDto> update(UserRequest user, Long id);

    void remove(Long id);
}
