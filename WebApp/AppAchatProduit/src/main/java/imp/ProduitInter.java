package imp;

import java.util.List;

import metier.product.Produit;

public interface ProduitInter {

	public Produit save(Produit p);

	public List<Produit> produitsParMC(String mc);

	public Produit getProduit(Long id);

	public Produit updateProduit(Produit p);

	public void deleteProduit(Long id);
} 