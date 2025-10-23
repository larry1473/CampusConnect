package com.larryfotso.campusconnect.repository;


import com.larryfotso.campusconnect.model.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TestEntityManager entityManager;
    
    @BeforeEach
    public void setUp(){
        // object to be saved before each test
        User user = User.builder()
            .email("test1@gmail.com") 
            .password("password")
            .build();
        // Saving the user 
        entityManager.persist(user);
        entityManager.flush();
    }

    @Test
    void SaveUserTOBD() {
        assertThat(userRepository.findByEmail("test1@gmail.com")).isPresent();
    }

    
}
