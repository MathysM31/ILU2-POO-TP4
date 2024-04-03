package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal{

	private Gaulois vendeur;
	private P[] produits;
	private int nbProduit;
	private int prixProduit;
	
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.produits = produit;
		this.prixProduit = prix;
	}
	
	
}
