package com.example.juint.dao.impl;

import com.example.juint.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-16 17:16
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void login() {
        System.out.println("hello");
    }
}
