import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "WinServlet", urlPatterns = "/win")
public class WinServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "ur a winner!";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

}