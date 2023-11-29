package ru.netology.jdbc.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repository.JdbcRepository;

import java.util.List;

@Service
public class JdbcServise {
    final private JdbcRepository jdbcRepository;

    public JdbcServise(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    public List<String> getProduct(String name) {
        return jdbcRepository.getProduct(name);
    }
}
