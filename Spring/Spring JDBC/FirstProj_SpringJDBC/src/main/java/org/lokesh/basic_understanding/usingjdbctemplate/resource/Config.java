package org.lokesh.basic_understanding.usingjdbctemplate.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
    @Bean
    DriverManagerDataSource dataSource (){
        DriverManagerDataSource dmds = new DriverManagerDataSource(
                "jdbc:mysql://localhost:3306/first_proj_spring_jdbc",
                "root",
                "Lokesh@2023"
        );
//        dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dmds.setUrl("jdbc:mysql://localhost:3306/first_proj_spring_jdbc");
//        dmds.setUsername("root");
//        dmds.setPassword("Lokesh@2023");
        return dmds;
    }

    @Bean("jdbcTemp")
    JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
}