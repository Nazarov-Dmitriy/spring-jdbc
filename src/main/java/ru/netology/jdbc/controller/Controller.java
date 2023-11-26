package ru.netology.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.servise.Servise;

@RestController
public class Controller {
    final private Servise servise;

    public Controller(Servise servise) {
        this.servise = servise;
    }

    @GetMapping("/products/fetch-product")
    public String productName(@RequestParam("name") String name) {
        return servise.getProduct(name);
    }
}
