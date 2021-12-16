package com.ddd.interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ddd")
public class DddInterfacesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddInterfacesApplication.class, args);
    }

}
