// 14. Write a program that accepts Employee Number, Employee Name, Designation, Qualifications and after submitting the form display that information on a page.

import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empNumber = request.getParameter("empNumber");
        String empName = request.getParameter("empName");
        String designation = request.getParameter("designation");
        String qualifications = request.getParameter("qualifications");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<html>")
                    .append("<body>")
                    .append("<h1>Employee Information</h1>")
                    .append("<p><strong>Employee Number:</strong> ").append(empNumber).append("</p>")
                    .append("<p><strong>Employee Name:</strong> ").append(empName).append("</p>")
                    .append("<p><strong>Designation:</strong> ").append(designation).append("</p>")
                    .append("<p><strong>Qualifications:</strong> ").append(qualifications).append("</p>")
                    .append("</body>")
                    .append("</html>");

        response.getWriter().write(htmlResponse.toString());
    }
}
