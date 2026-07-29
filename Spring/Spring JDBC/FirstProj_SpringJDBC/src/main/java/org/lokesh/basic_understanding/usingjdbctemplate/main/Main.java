package org.lokesh.basic_understanding.usingjdbctemplate.main;

import org.jspecify.annotations.Nullable;
import org.lokesh.basic_understanding.usingjdbctemplate.bean.Student;
import org.lokesh.basic_understanding.usingjdbctemplate.extractor.StudentResultSetExtractor;
import org.lokesh.basic_understanding.usingjdbctemplate.resource.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jdbcTemp = (JdbcTemplate)context.getBean("jdbcTemp");
        //Insertion Using Update
//        String name ="Lokesh";
//        int rollno= 10;
//        String city = "xyz";
//
//        String sql ="INSERT INTO student (name, rollno, city) VALUES (?,?,?)";
//        int i = jdbcTemp.update(sql, name, rollno, city);
//
//        if(i>0)
//            System.out.println("Entry Inserted");
//        else
//            System.out.println("Something Went Wrong");

        //Update using update()
        /*
        String sql ="UPDATE student SET city=? WHERE rollno=?";
        int i = jdbcTemp.update(sql, "xyz", 12);
        if(i>0)
            System.out.println(i+" rows updated");
        else
            System.out.println("No data updated");
        */

         //deletion using update()
//        String sql = "DELETE FROM student WHERE rollno=?";
//        int i = jdbcTemp.update(sql, 12);
//        if(i>0)
//            System.out.println(i+" Rows deleted");
//        else
//            System.out.println("Nothing is Deleted");


        // select statement using query() return multiple rows
//        String sql ="SELECT * FROM student";
//        List<Student> studentList= jdbcTemp.query(sql,new StudentMapper());
//        for (Student std : studentList){
//            System.out.println(std);
//            System.out.println("-------------");
//        }

        // select query for single row using query()
//        String sql= "SELECT * FROM student where rollno=?";
//        Student student=jdbcTemp.queryForObject(sql,new StudentMapper(),10);
//        System.out.println(student);


        //Select query using ResultSetExtractor
//        String sql= "SELECT * FROM student";
//        List<Student> studentList = jdbcTemp.query(sql, new StudentResultSetExtractor());
//        for (Student std : studentList){
//            System.out.println("Name: "+std.getName());
//            System.out.println("Roll: "+std.getRollno());
//            System.out.println("City: "+std.getCity());
//            System.out.println("------");
        //select query for List
//        String sql = "SELECT * FROM student";
//        List<Map<String, Object>> studentList=jdbcTemp.queryForList(sql);
//        for(Map<String,Object> list: studentList){
//            System.out.println(list.get("name"));
//            System.out.println(list.get("rollno"));
//            System.out.println(list.get("city"));
//            System.out.println("-------------");
//        }

        //Select query using ForMap which exactly return single result
//            String sql= "SELECT * FROM student where rollno=?";
//            Map<String, Object> stringObjectMap = jdbcTemp.queryForMap(sql,11);
//            System.out.println(stringObjectMap.get("name"));
//            System.out.println(stringObjectMap.get("rollno"));
//            System.out.println(stringObjectMap.get("city"));



        }
}

