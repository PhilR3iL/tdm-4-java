package ecole3il.java.tdm4.exo51;

public class Voiture extends MoyenDeTransport {

	public Voiture(int vitesseInitiale) {
		super(0, 0);
		limitation(vitesseInitiale * 10, 150);
	}

	// Uniquement autorisé dans le cadre de l'exercice
	@Override
	public void deplacementEnY() {
	}
}
