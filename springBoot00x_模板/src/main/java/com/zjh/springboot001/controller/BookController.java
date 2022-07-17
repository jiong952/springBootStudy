package com.zjh.springboot001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张俊鸿
 * @description: 测试
 * @since 2022-07-06 11:21
 */
@RestController
@RequestMapping("/boot")
public class BookController {
    @GetMapping
    public String getById(){
        System.out.println("hello001");
        return "hello001";
    }
}
