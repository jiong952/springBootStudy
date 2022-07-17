package com.zjh.springboot007_mp.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjh.springboot007_mp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-16 18:28
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
