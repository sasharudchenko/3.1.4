package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
