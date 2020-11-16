package web;

import java.sql.SQLException;
import java.util.List;

public interface ICatalogue {
    public List<Produit> getProduitsParMotCle(String mc);

    public void addProduit(Produit p);

    public List<Produit> getAllProducts();

    public void updateProduit(Produit p) throws SQLException;

    public Produit getProductById(int id);

    public void deleteProduitById(int id);
}
