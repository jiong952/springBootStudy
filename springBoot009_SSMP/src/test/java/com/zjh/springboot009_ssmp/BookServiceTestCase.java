package com.zjh.springboot009_ssmp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjh.springboot009_ssmp.pojo.Book;
import com.zjh.springboot009_ssmp.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-17 15:31
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;
    @Test
    public void testById(){
        System.out.println(bookService.getById(1));
    }
    @Test
    public void getAll(){
        bookService.list(null);
    }
    @Test
    public void getSave(){
        Book book = new Book();
        book.setName("书");
        book.setDescription("这是书");
        book.setType("书书");
        bookService.save(book);
    }
    @Test
    //分页
    public void getByPage(){
        IPage page = new Page(1,5);
        bookService.page(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}
