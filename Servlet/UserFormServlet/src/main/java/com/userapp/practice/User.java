//package com.userapp.practice;
//
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/user")
//public class User extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("At User");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/user-info");
//        requestDispatcher.forward(req,resp);
////        requestDispatcher.include(req,resp);
//        System.out.println("At first again");
//    }
//
//}
