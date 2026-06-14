package com.example.Project007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class Project007Application {
    public static void main(String[] args) {
        SpringApplication.run(Project007Application.class, args);
    }
}