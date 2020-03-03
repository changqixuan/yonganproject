package com.yongan.upmseurekayongan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UpmsEurekaYonganApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsEurekaYonganApplication.class, args);
    }

}
