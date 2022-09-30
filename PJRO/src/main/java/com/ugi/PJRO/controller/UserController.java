package com.ugi.PJRO.controller;

import com.ugi.PJRO.Entity.User;
import com.ugi.PJRO.exception.ResourceNotFoundException;
import com.ugi.PJRO.repository.UserRepository;
import com.ugi.PJRO.security.CurrentUser;
import com.ugi.PJRO.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
