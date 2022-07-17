package com.zjh.springboot001.controller;

import com.zjh.springboot001.pojo.ZJH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张俊鸿
 * @description: 测试
 * @since 2022-07-06 11:21
 */
@RestController
@RequestMapping("/boot")
public class BookController {

//    @Value("${hobby}")
//    private String port1;

    @Autowired
    private Environment env;

    @Autowired
    private ZJH zjh;

    @GetMapping
    public String getById(){
        List<Integer> list = new ArrayList<>();
        list.stream().mapToInt(Integer::intValue).toArray();
        
        System.out.println(zjh);
//        System.out.println(port1);
        return "1";
    }
}
