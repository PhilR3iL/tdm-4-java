package ecole3il.java.tdm4.exo11;

import java.util.Objects;

public class RectangleColore extends Rectangle{

	private String couleur;

	public RectangleColore(double largeur, double hauteur, String couleur) {
		super(largeur, hauteur);
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		return super.toString() + "couleur = " + couleur + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(couleur);
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		boolean parent = super.equals(obj);
		if(parent) {
			if(obj instanceof RectangleColore) {
				RectangleColore rect = (RectangleColore) obj;
				return rect.couleur.equals(this.couleur);
			}
			return false;
		}
		return false;
	}
	
}
