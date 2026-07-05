package com.servlet_jsp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first")
public class fisrtServlet implements Servlet{
    private ServletConfig servletConfig;

    @Override
    public void destroy() {
        System.out.println("Servlet destroy");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        System.out.println("Initializing Servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service Request");
    }

    @Override
    public String getServletInfo() {
        return "This Servlet is created by me";
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

}
