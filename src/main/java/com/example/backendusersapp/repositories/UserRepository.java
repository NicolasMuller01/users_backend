package com.example.backendusersapp.repositories;

import com.example.backendusersapp.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
