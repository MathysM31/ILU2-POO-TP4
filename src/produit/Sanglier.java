package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{

	private int poids;
	private Gaulois chasseur;
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier","kilogramme");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public String descriptionProduit() {
		return "sanglier de " + poids + "kg chassé par " + chasseur;
	}
}
