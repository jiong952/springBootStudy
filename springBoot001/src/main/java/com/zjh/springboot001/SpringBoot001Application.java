package com.zjh.springboot001;

import com.zjh.springboot001.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot001Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot001Application.class, args);
		BookController controller = context.getBean(BookController.class);
		System.out.println(controller);
	}

}
