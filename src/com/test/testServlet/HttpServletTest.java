package com.test.testServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//使用以下的注解才可以通过jsp访问到这个Servlet，自带的注解不行
//要带斜杠
@WebServlet("/HttpServletTest")
public class HttpServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
        System.out.println("这是Post请求");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        System.out.println(username);
        String []hobby=request.getParameterValues("hobby");
        for (String x:hobby
             ) {
            System.out.println(x);
        }
        System.out.println("这是Get请求");
//        返回发出请求的客户段的IP地址
        System.out.println(request.getRemoteAddr());
//        返回客户端发出请求时完整的IP地址
        System.out.println(request.getRequestURL());
//        返回web服务器的IP地址
        System.out.println(request.getLocalAddr());
//        返回提交方式
        System.out.println(request.getMethod());
    }
}
