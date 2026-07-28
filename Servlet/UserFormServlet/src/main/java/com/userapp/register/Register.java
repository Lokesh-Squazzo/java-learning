package com.userapp.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("upassword");
        String city = req.getParameter("city");

        try {
            Connection connection = DBConfig.getConnection();
            PreparedStatement ps= connection.prepareStatement
                    ("INSERT INTO User (user_name,email,password,city) VALUES (?,?,?,?)");
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,pass);
            ps.setString(4,city);

            int i = ps.executeUpdate();
            PrintWriter writer = resp.getWriter();

            if (i>0){
                resp.sendRedirect("./success.html");
//                writer.println("<h1>Success</h1>");
//                writer.println("<h3>Welcome "+name+"</h3>");
            }else {
                writer.println("<h1>Failed Try Again</h1>");
            }

            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
