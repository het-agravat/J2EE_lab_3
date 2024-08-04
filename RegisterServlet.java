// 15. Write a program that registers a student by providing rollno, name, course, sem, division,Hobbies and after submitting the form display the information on a page. (Hint: By using getParameterNames() and getParameterValues())

import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;


public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Registered Student Information</h1>");

        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            out.print("<strong>" + paramName + ": </strong>");

            String[] paramValues = request.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<em>Not provided</em>");
                else
                    out.println(paramValue);
            } else {
                out.println("<ul>");
                for (String paramValue : paramValues) {
                    out.println("<li>" + paramValue + "</li>");
                }
                out.println("</ul>");
            }
        }

        out.println("</body></html>");
    }
}
