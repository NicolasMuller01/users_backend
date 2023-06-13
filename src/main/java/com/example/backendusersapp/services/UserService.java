package com.example.backendusersapp.services;

import com.example.backendusersapp.models.entities.User;
import com.example.backendusersapp.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService{
    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    Optional<User> update(User user, Long id);

    void remove(Long id);
}
