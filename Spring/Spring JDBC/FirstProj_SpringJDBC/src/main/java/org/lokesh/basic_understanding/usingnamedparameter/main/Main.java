package org.lokesh.basic_understanding.usingnamedparameter.main;

import org.lokesh.basic_understanding.usingnamedparameter.resourse.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        NamedParameterJdbcTemplate namedPara = (NamedParameterJdbcTemplate) context.getBean("namedPara");
        Map<String, Object> map = new HashMap<>();
        map.put("key_name","Lokesh");
        map.put("key_rollno",10);
        map.put("key_city","xyz");
        String sql = "INSERT INTO student (name, rollno,city) VALUES (:key_name,:key_rollno,:key_city)";

        int i = namedPara.update(sql, map);
        if(i>0)
            System.out.println("Insertion Complete");
        else
            System.out.println("Something Went wrong");
    }
}
