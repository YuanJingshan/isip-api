package com.jyyy.isip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YuanJingshan
 * @version 1.0
 * @description 应用入口
 * @date Create in 2018/10/31 9:18
 */
@SpringBootApplication
//@EnableScheduling
//@EnableCaching
@MapperScan("com.jyyy.isip")
public class ISIPApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ISIPApiApplication.class, args);
    }
}
