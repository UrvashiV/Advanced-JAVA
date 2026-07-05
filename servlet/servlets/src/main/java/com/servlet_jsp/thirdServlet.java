package com.servlet_jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class thirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Processing do get request by third servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String msg= req.getParameter("message");
        System.out.println("Form submitted using third servlet post method");
        System.out.println("message:"+msg);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Form Submitted. Thank you!!</h1>");
        out.print("<p>Message is: "+msg+"</p>");
    }
}
