package feedback_app_session_manage;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.UUID;

//@WebServlet("/servlet1")
public class request1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String userName= "Urvc";
                String userID= "12341";

                Cookie cookie= new Cookie("userName",userName);
                var cookie1 = new Cookie("userID",userID);
                cookie.setMaxAge(10*60);
                cookie1.setMaxAge(10*60);
                resp.addCookie(cookie);
                resp.addCookie(cookie1);

                HttpSession session = req.getSession();
                session.setAttribute("userSecret", UUID.randomUUID().toString());

                session.setMaxInactiveInterval(10*60);

                ServletConfig servletConfig = getServletConfig();
                ServletContext servletContext = servletConfig.getServletContext();
                String appName= servletContext.getInitParameter("app_name");
                String username= servletConfig.getInitParameter("userName");

                resp.setContentType("text/html;charset=UTF-8");
                resp.getWriter().println("<h1>Cookie set successfully!!</h1>");
                resp.getWriter().println("""
                        <h1>Context Param: %s</h1>
                        <h1>Init Parama: %s<h1>""".formatted(appName,username));
    }
}
