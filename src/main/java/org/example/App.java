package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.oas.annotations.EnableOpenApi;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableOpenApi
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
