package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "add", urlPatterns = { "/add" })
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("AddProduit.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("name");
        Double price = Double.parseDouble(req.getParameter("price"));
        Integer quantity = Integer.parseInt(req.getParameter("quantity"));
        System.out.println("nom"+nom);
        System.out.println("nom"+price);
        System.out.println("nom"+quantity);

        CatalogueImpl metier = new CatalogueImpl();
        metier.addProduit(new Produit(nom,price,quantity));
        RequestDispatcher rd = req.getRequestDispatcher("ProduitsView.jsp");
        rd.forward(req, resp);
    }
}
