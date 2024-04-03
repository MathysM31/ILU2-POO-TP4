package produit;

public class Poisson extends Produit{

	private String dateDePeche;

	public Poisson(String dateDePeche) {
		super("poisson","kilogramme");
		this.dateDePeche = dateDePeche;
	}
	
	@Override
	public String descriptionProduit() {
		return "poisson pêchés " + dateDePeche;
	}
}
