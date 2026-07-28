package com.lokesh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/submit", loadOnStartup = 1)
public class Register extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.lokesh.HibernateConfig");
            System.out.println("Hibernate Loaded");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        long number =Long.parseLong(req.getParameter("number"));
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        String password = req.getParameter("password");

        Student student= new Student(name,number,email,city,password);
        boolean result = HibernateConfig.persist(student);
        PrintWriter writer = resp.getWriter();
        if(result){
            resp.sendRedirect("login.html");
        }else{
            writer.println("<h1>Failed</h1>");
        }
    }

}
