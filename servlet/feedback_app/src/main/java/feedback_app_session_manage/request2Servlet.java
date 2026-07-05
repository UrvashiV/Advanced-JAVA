package feedback_app_session_manage;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/servlet2")
public class request2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html;charset=UTF-8");
         var out = resp.getWriter();
         Cookie[] cookies = req.getCookies();
         boolean flag = false;
        StringBuilder content = new StringBuilder();
         if(cookies!=null){


          for(Cookie c: cookies)
          {
              String name = c.getName();
              if(name.equals("userName")){
                  System.out.println("username: " + c.getValue());
                  content.append("""
                          <h1> Welcome:  %s</h1>""".formatted(c.getValue()));
                  flag = true;
              } else if(name.equals("userID")){
                  System.out.println("username: " + c.getValue());
                  content.append("""
                          <h1> UserID:  %s</h1>""".formatted(c.getValue()));
                  flag = true;
              }
          }

         }

        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = servletConfig.getServletContext();
        String appName= servletContext.getInitParameter("app_name");
        String userEmail= servletConfig.getInitParameter("userEmail");


         HttpSession session= req.getSession();
         String secret= session.getAttribute("userSecret").toString();
         content.append("""
                 <h1>Session Secret :  %s</h1>""".formatted(secret));

         if(flag) {
             out.println("<h1>User is present</h1>");
             out.println(content);
         }
         else{
             out.println("<h1> User cookie is not there in request.</h1>");
         }
        resp.getWriter().println("""
                        <h1>Context Param: %s</h1>
                        <h1>Init Parama: %s<h1>""".formatted(appName,userEmail));

    }
}
