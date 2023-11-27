package ru.netology.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.servise.JdbcServise;

@RestController
public class JdbcController {
    final private JdbcServise jdbcServise;

    public JdbcController(JdbcServise jdbcServise) {
        this.jdbcServise = jdbcServise;
    }

    @GetMapping("/products/fetch-product")
    public String productName(@RequestParam("name") String name) {
        return jdbcServise.getProduct(name).toString();
    }
}
