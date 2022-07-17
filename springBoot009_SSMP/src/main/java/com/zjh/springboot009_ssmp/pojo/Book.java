package com.zjh.springboot009_ssmp.pojo;

import lombok.Data;

/**
 * @author 张俊鸿
 * @description: 图书类
 * @since 2022-07-17 0:59
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
