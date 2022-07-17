package com.zjh.springboot009_ssmp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjh.springboot009_ssmp.dao.BookDao;
import com.zjh.springboot009_ssmp.pojo.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-17 1:20
 */
@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;
    @Test
    public void testById(){
        System.out.println(bookDao.selectById(1));
    }
    @Test
    public void getAll(){
        bookDao.selectList(null);
    }
    @Test
    public void getSave(){
        Book book = new Book();
        book.setName("书");
        book.setDescription("这是书");
        book.setType("书书");
        bookDao.insert(book);
    }
    @Test
    //分页
    public void getByPage(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getPages());
        System.out.println(page.getCurrent());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
    @Test
    //按条件查询 QueryWrapper
    public void getByCondition(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","C");
        bookDao.selectList(qw);
    }
    @Test
    //按条件查询 QueryWrapper
    public void getByCondition2(){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Book::getName,"C");
        bookDao.selectList(lqw);
    }
    @Test
    //按条件查询 QueryWrapper
    public void getByCondition3(){
        //业务中经常要判空操作
        String name = "3";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(name),Book::getName,name);
        bookDao.selectList(lqw);
    }
}
