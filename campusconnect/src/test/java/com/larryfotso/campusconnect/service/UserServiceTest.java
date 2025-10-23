package com.larryfotso.campusconnect.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;

import com.larryfotso.campusconnect.model.User;
import com.larryfotso.campusconnect.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    private  String email = "larry@gmail.com";

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;
    
    @BeforeEach
    public void setUp() {
        User user = 
            User.builder()
            .email(email)
            .password("password")
            .build();
        Mockito.when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));

        
    }

    @Test
    public void saveUserToBd() {
        String userEmail = "larry@gmail.com";
        
        User user = userService.findByEmail(userEmail);

        assertEquals(userEmail, user.getEmail());
        
    }


    
}
