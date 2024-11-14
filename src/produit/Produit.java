package produit;

public abstract class Produit {
	private String nom;
	private String unite;
	
	public Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}
	
	public String decrireProduit() {
		return "nom " + nom;
	}
}
