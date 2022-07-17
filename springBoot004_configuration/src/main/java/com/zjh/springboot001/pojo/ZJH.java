package com.zjh.springboot001.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 张俊鸿
 * @description: test
 * @since 2022-07-09 2:45
 */
@Component
@ConfigurationProperties(prefix = "zjh")
public class ZJH {
    private String hobby;
    private String name;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZJH{" +
                "hobby='" + hobby + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
