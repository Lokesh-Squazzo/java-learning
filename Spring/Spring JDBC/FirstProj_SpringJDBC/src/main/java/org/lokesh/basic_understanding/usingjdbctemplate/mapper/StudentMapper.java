package org.lokesh.basic_understanding.usingjdbctemplate.mapper;

import org.lokesh.basic_understanding.usingjdbctemplate.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student>{
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setName(rs.getString("name"));
        student.setRollno(rs.getInt("rollno"));
        student.setCity(rs.getString("city"));
        return student;
    }
}
