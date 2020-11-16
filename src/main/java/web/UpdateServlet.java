package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "update", urlPatterns = { "/update" })
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        CatalogueImpl metier = new CatalogueImpl();
        Produit produit = metier.getProductById(id);
        System.out.println("NOM PRODUIT"+produit.nomProduit);
        SingletonProduit produit1 = new SingletonProduit();
        produit1.setProduit(produit);
        req.setAttribute("produit", produit1);
        RequestDispatcher rd = req.getRequestDispatcher("UpdateProduit.jsp");
        rd.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom = req.getParameter("name");
        Double price = Double.parseDouble(req.getParameter("price"));
        Integer quantity = Integer.parseInt(req.getParameter("quantity"));
        Long id = Long.parseLong(req.getParameter("id"));
        System.out.println("id : "+id);

        CatalogueImpl metier = new CatalogueImpl();
        metier.updateProduit(new Produit(id ,nom,price,quantity));


        RequestDispatcher rd = req.getRequestDispatcher("ProduitsView.jsp");
        rd.forward(req, resp);
    }
}
