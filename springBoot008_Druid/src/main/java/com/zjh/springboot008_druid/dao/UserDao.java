package com.zjh.springboot008_druid.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.zjh.springboot008_druid.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-16 18:28
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
