package com.goruslan.githubportfoliobuilder.service;

import com.goruslan.githubportfoliobuilder.models.User;
import com.goruslan.githubportfoliobuilder.repositories.RoleRepository;
import com.goruslan.githubportfoliobuilder.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;

    public UserService(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    public Optional<User> findByUsername(String username) { return userRepository.findByUsername(username); }

    public User register(User user) {

        // Do registration here

        return user;
    }

    public User save(User user) {
         return userRepository.save(user);
    }

}
