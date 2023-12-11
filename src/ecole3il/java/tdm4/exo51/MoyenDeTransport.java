package ecole3il.java.tdm4.exo51;

public abstract class MoyenDeTransport implements Deplacement {
	private int x;
	private int y;
	private int vitesse;
	public MoyenDeTransport(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		vitesse = 10;
	}
	@Override
	public void deplacementEnX() {
		x += vitesse;		
	}
	@Override
	public void deplacementEnY() {
		y += vitesse;
		
	}
	@Override
	public void seDeplacer() {
		deplacementEnX();
		deplacementEnY();
	}
	
	public void limitation(int vitesse, int limite) {
		this.vitesse = (vitesse < limite) ? vitesse : limite;
	}
	
}
