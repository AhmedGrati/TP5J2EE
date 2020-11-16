package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete", urlPatterns = { "/delete" })
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        CatalogueImpl metier = new CatalogueImpl();
        if (id != null) {
            metier.deleteProduitById(Integer.parseInt(id));
        }
        RequestDispatcher rd = req.getRequestDispatcher("ProduitsView.jsp");
        rd.forward(req, resp);
    }
}
