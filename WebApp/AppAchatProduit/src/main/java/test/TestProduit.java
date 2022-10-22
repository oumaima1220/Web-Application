package test;

import java.util.List;

import imp.ImpProduitInter;
import metier.product.Produit;

public class TestProduit {
	public static void main(String[] args) {
		ImpProduitInter pdao= new ImpProduitInter();
		Produit prod= pdao.save(new Produit("Lenovo PC",1241));
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("Lenovo");
		for (Produit p : prods)
		System.out.println(p);
		}


}
