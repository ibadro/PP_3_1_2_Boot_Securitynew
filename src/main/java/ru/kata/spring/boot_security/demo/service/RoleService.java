package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();

    Set<Role> getByName(String name);

    void saveRole(Role role);
}
