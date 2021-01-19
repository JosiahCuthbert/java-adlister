import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        count++;

        String name = req.getParameter("name");
        String reset = req.getParameter("reset");

        if(reset.equalsIgnoreCase("true")){
            count = 0;
        }

        out.println("<h1>Page viewed "  + count + " times<h1>");

        if(name == null){
            out.println("<h1>Hello, World<h1>");
        }   else{
            out.println("<h1>Hello, " + name + "<h1>");
        }

    }

    protected int count = 0;

}
