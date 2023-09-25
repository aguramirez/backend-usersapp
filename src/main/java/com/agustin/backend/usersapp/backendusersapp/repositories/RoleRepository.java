package com.agustin.backend.usersapp.backendusersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.agustin.backend.usersapp.backendusersapp.models.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    
    Optional<Role> findByName(String username);
}
