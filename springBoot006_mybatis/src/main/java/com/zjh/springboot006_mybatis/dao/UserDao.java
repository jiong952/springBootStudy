package com.zjh.springboot006_mybatis.dao;

import com.zjh.springboot006_mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-16 18:28
 */
@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> getAll();
}
