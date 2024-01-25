package com.example.server_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
//exclude 옵션 추가
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ServerStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerStudyApplication.class, args);
    }

}
