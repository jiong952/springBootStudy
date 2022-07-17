package com.example;

import com.example.juint.JuintApplication;
import com.example.juint.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = JuintApplication.class)
class JuintApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        userDao.login();
    }

}
