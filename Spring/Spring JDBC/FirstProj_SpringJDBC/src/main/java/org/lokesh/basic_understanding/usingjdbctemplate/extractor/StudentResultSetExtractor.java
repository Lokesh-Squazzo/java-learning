package org.lokesh.basic_understanding.usingjdbctemplate.extractor;

import org.lokesh.basic_understanding.usingjdbctemplate.bean.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {

    @Override
    public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Student> studentList = new ArrayList<>();
        Student std;
        while(rs.next()) {
            std= new Student();
            std.setName(rs.getString("name"));
            std.setRollno(rs.getInt("rollno"));
            std.setCity(rs.getString("city"));
            studentList.add((std));
        }
        return studentList;
    }
}
