package produit;

public enum Unite {
	GRAMME("g"), LITRE("l"), MILLILITRE("ml"), KILOGRAMME("kg"), CENTILITRE("cl"), PIECE("piece");
	
	private String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
