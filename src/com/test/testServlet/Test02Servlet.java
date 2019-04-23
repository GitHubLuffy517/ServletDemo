package com.test.testServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Test02Servlet")
public class Test02Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("username",request.getParameter("username"));
//        request.setAttribute("password",request.getParameter("password"));
//        在servlet中获取session要先创建对象，在jsp中不用，是jsp的内置对象
        HttpSession session=request.getSession();
        session.setAttribute("username",request.getParameter("username"));
        session.setAttribute("password",request.getParameter("password"));
//        请求转发，地址栏的URL不会发生变化
//        request.getRequestDispatcher("Test02.jsp").forward(request,response);
//        请求重定向,地址栏的URL会变化，request对象失效，可以用session或者application来存储数据，可以跨应用跳转
        response.sendRedirect("Test02.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
