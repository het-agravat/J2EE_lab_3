// 13. Write a program that accepts username and after submitting the form, welcomes the user by writing “Welcome Username”.

import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<html>")
                    .append("<body>")
                    .append("<h1>Welcome, ").append(username).append("!</h1>")
                    .append("</body>")
                    .append("</html>");

        response.getWriter().write(htmlResponse.toString());
    }
}
