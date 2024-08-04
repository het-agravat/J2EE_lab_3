// 11. Write a servlet which prints Hello World.

import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("<html><body><h1>Hello, World!</h1></body></html>");
    }
}
