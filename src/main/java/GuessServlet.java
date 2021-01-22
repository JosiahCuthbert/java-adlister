
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        double userGuess = Double.parseDouble(request.getParameter("guess"));
//        double random = (Math.random() * (3 - 1 + 1) + 1);
//        String outcome;
//
//        if(random == userGuess){
//            outcome = "winner!";
//        } else{
//            outcome = "loser :(";
//        }

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double userGuess = Double.parseDouble(request.getParameter("guess"));
        double random = (Math.random() * (3 - 1 + 1) + 1);

        if(random == userGuess){
            response.sendRedirect("/win");
        } else{
            response.sendRedirect("/lose");
        }
    }



}