package produit;

public abstract class Produit implements IProduit {

	protected String nom;
	protected String unite;

	
	protected Produit(String nom, String unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
	
	@Override
	public String descriptionProduit() {
		return "nom :" + nom;
	}
}
