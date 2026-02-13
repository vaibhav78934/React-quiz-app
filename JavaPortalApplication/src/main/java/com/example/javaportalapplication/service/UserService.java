package com.example.javaportalapplication.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.javaportalapplication.repository.UserRepository;
import com.example.javaportalapplication.model.User;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }
}
