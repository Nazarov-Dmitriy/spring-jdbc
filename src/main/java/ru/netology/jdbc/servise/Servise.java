package ru.netology.jdbc.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repository.Repository;

@Service
public class Servise {
    private @Autowired Repository repository;

    public String getProduct(String name) {
        return repository.getProduct(name);
    }
}
