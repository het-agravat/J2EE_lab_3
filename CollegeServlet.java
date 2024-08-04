import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class CollegeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<html>")
                    .append("<body>")
                    .append("<h1>T. N. Rao College</h1>")
                    .append("<h2>T. N. Rao College</h2>")
                    .append("<h3>T. N. Rao College</h3>")
                    .append("<h4>T. N. Rao College</h4>")
                    .append("<h5>T. N. Rao College</h5>")
                    .append("<h6>T. N. Rao College</h6>")
                    .append("</body>")
                    .append("</html>");
        
        response.getWriter().write(htmlResponse.toString());
    }
}
