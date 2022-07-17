package com.zjh.springboot009_ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjh.springboot009_ssmp.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-17 1:18
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
