package com.test.testServlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ConfigTest implements Servlet {
    private ServletConfig config;
    public ConfigTest() {
        super();
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        获取web.xml中的配置的初始化参数，单个获取
        String username=config.getInitParameter("username");
        System.out.println("username");

        Enumeration<String> params=config.getInitParameterNames();
        while (params.hasMoreElements()){
            String name=params.nextElement();
            String pass=config.getInitParameter(name);
            System.out.println("name:"+name+"pass:"+pass);
        }
        System.out.println("ServletName:"+config.getServletName());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
