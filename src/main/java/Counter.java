// import java.io.*;
// import javax.servlet.*;
// import javax.servlet.http.*;

// public class Counter extends HttpServlet {
//     int accesses = 0;

//     public void doGet(HttpServletRequest request, HttpServletResponse response)
//          throws IOException, ServletException
//     {
//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();

//         accesses++;
//         out.print("Number of times this servlet has been accessed:" + accesses);
//     }
// } 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
