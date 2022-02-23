package com.maxsoft.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.maxsoft")

public class HolamundoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HolamundoApplication.class, args);
    }
}
