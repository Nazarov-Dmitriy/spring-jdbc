package ru.netology.jdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public String getProduct(String name) {
        Map<String, String> parametrs = new HashMap<>();
        parametrs.put("name", name);
        String product = namedParameterJdbcTemplate.query("select product_name from orders o join customers c on c.id = o.customer_id where c.name = lower(:name)", parametrs, (rs) -> {
            String nameProd = null;
            if (rs.next()) {
                nameProd = rs.getString("product_name");
                System.out.println(nameProd);
            }
            return nameProd;
        });
        return product;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

