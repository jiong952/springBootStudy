package com.zjh.springboot009_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.springboot009_ssmp.pojo.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-17 15:28
 */
public interface BookService extends IService<Book> {

    IPage<Book> getByPage(Integer currentPage, Integer pageSize);
    IPage<Book> getByPage(Integer currentPage, Integer pageSize,Book book);
}
