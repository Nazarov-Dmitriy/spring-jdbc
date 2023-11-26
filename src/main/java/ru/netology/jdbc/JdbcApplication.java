package ru.netology.jdbc;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(JdbcApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
