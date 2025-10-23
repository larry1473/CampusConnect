package com.larryfotso.campusconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.larryfotso.campusconnect.model.User;
import com.larryfotso.campusconnect.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String userEmail) {
        return userRepository.findByEmail(userEmail).orElse(null);
        
    }


    
}
