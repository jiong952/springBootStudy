package com.zjh.springboot009_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zjh.springboot009_ssmp.controller.utils.R;
import com.zjh.springboot009_ssmp.pojo.Book;
import com.zjh.springboot009_ssmp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-17 15:48
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    /**查询单个**/
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        if(bookService.getById(id) == null){
            return new R(false,null);
        }
        return new R(true,bookService.getById(id));
    }
    /**查询全部**/
    @GetMapping()
    public R getAll(){
        if(bookService.list() == null){
            return new R(false,null);
        }
        return new R(true,bookService.list());
    }
    /**分页查询**/
    @GetMapping("{currentPage}/{pageSize}")
    public R getByPage(@PathVariable  Integer currentPage, @PathVariable  Integer pageSize, Book book){
        IPage<Book> page = bookService.getByPage(currentPage, pageSize,book);
        if(page == null){
            return new R(false,null);
        }
        if(currentPage > page.getPages()){
            page = bookService.getByPage((int) page.getPages(), pageSize,book);
        }
        return new R(true,page);
    }
    /**插入数据**/
    @PostMapping
    public R save(@RequestBody Book book) throws Exception {
//        if(book.getName().equals("123")) throw new Exception();  //测试异常
        boolean flag = bookService.save(book);
        return new R(flag,flag? "添加成功" : "添加失败");
    }
    /**修改数据**/
    @PutMapping
    public R update(@RequestBody Book book){
        boolean flag = bookService.updateById(book);
        return new R(flag,flag? "更新成功" : "更新失败");
    }
    /**删除数据**/
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        boolean flag = bookService.removeById(id);
        return new R(flag,flag? "删除成功" : "删除失败");
    }
}
