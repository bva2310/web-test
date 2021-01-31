package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/artists")
public class ArtistDto extends HttpServlet {
    String name;
    boolean classical;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute(name, "Mozzart");
        req.setAttribute(String.valueOf(classical), "classical");
                getServletContext().getRequestDispatcher("/artists.jsp").forward(req, resp);;
    }
}
