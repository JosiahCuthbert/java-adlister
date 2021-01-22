import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "LoseServlet", urlPatterns = "/lose")
public class LoseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "ur a loser:(";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

}