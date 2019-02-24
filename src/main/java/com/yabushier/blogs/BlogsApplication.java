package com.yabushier.blogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yabushier.blogs.mapper")
@SpringBootApplication
public class BlogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogsApplication.class, args);
    }

}
