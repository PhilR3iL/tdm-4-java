package ecole3il.java.tdm4.exo51;

public class Fusee extends MoyenDeTransport {

	public Fusee(int vitesseInitiale) {
		super(0, 0);
		limitation(vitesseInitiale * 100, 1200);
	}
	
}
