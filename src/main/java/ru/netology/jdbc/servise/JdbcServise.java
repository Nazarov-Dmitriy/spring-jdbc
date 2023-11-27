package ru.netology.jdbc.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repository.JdbcRepository;

import java.util.List;

@Service
public class JdbcServise {
    private @Autowired JdbcRepository jdbcRepository;

    public List<String> getProduct(String name) {
        return jdbcRepository.getProduct(name);
    }
}
