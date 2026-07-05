package feedback_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/feedback")
public class feedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String message = req.getParameter("feedback_msg");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Feedback form is working</h1>");

        out.println("""
                <h2> Your form details that you have submitted.</h2>
                <h3> Email: %s</h3>
                <h3> Phone: %s</h3>
                <h3> Message: %s</h3>
                """.formatted(email, phone, message));
   }
}
