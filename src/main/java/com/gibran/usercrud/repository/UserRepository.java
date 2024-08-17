package com.gibran.usercrud.repository;

import com.gibran.usercrud.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
