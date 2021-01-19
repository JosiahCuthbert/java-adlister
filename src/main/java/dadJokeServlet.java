import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "dadJokeServlet", urlPatterns = "/dadjoke")
public class dadJokeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String passedJoke = req.getParameter("joke");

        if(passedJoke == null){
            passedJoke = "hungry";
        }

        String content = "<h1>Hi " + passedJoke + ", I'm dad!<h1>";

        out.println(content);
    }
}




