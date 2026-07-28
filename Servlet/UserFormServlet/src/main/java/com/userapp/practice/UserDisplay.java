//package com.userapp.practice;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/user-info")
//public class UserDisplay extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String city = req.getParameter("city");
//        PrintWriter pw=resp.getWriter();
//        pw.println("Hello "+name+" We are glad to have you.");
//        pw.println("We "+city);
//        pw.close();
//        System.out.println("At user-info");
//    }
//}
