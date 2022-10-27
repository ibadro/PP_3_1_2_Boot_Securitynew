package ru.kata.spring.boot_security.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Repository
public interface UserRepository  {
    List<User> getAllUsers();

    void create(User user);

    User getUserById(Long id);

    void delete(Long id);

    void update(User user);

    User findByUsername(String username);

}