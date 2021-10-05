package com.example.exercisepi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class ExercisePiApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(ExercisePiApplication.class, args);
    }

}
