package ecole3il.java.tdm4.exo51;

public class Ascenseur extends MoyenDeTransport {

	public Ascenseur(int vitesseInitiale) {
		super(0, 0);
		limitation(vitesseInitiale * 5, 50);
	}
	
	@Override
	public void deplacementEnX() {
	}

}
