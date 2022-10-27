package ru.kata.spring.boot_security.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Set;

@Repository
//public interface RoleRepository extends JpaRepository<Role, Long> {
public interface RoleRepository  {
    Set<Role> getAllRoles();

    Set<Role> getByName(String name);

    void saveRole(Role role);
}