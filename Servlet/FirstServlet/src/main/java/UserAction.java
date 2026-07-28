import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/useraction")
public class UserAction extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String name = req.getParameter("name");
        String city= req.getParameter("city");
        PrintWriter printWriter =resp.getWriter();
        printWriter.println("Welcome : "+name);
        printWriter.println("You live in : "+city);
        printWriter.close();
    }
}
