package com.study.oauth2basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Oauth2BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2BasicApplication.class, args);
    }

}
