package org.lokesh.basic_understanding.usingjdbctemplate.main;

import org.lokesh.basic_understanding.usingjdbctemplate.bean.Student;
import org.lokesh.basic_understanding.usingjdbctemplate.mapper.StudentMapper;
import org.lokesh.basic_understanding.usingjdbctemplate.resource.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

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
        String sql ="SELECT * FROM student";
        List<Student> studentList= jdbcTemp.query(sql,new StudentMapper());
        for (Student std : studentList){
            System.out.println(std);
            System.out.println("-------------");
        }

        // select query for single row using query()
//        String sql= "SELECT * FROM student where rollno=?";
//        Student student=jdbcTemp.queryForObject(sql,new StudentMapper(),10);
//        System.out.println(student);
    }
}
