package com.zjh.springboot007_mp;

import com.zjh.springboot007_mp.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot007MpApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.selectById(1));
    }

}
