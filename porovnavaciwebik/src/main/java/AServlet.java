import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/test")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        int x = Integer.parseInt(request.getParameter("a"));
        int y = Integer.parseInt(request.getParameter("b"));
        int z = Integer.parseInt(request.getParameter("c"));
        int vysledek;
        if (x>y && x>z) {
            vysledek = x;
        } else if (y>x && y>z) {
            vysledek = y;
        } else {
            vysledek = z;
        }
        request.setAttribute("p", x);
        request.setAttribute("d", y);
        request.setAttribute("t", z);
        request.setAttribute("v", vysledek);

        request.getRequestDispatcher("/final.jsp").forward(request,response);



    }
}