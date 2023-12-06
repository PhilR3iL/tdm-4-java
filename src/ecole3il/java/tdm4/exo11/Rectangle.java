package ecole3il.java.tdm4.exo11;

import java.util.Objects;

public class Rectangle {
	private double largeur;
	private double hauteur;

	public Rectangle(double largeur, double hauteur) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rectangle :\n");
		sb.append("largeur = " + this.largeur + "\n");
		sb.append("hauteur = " + this.hauteur + "\n");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(hauteur, largeur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Rectangle))
			return false;
		if (!(this instanceof RectangleColore) && obj instanceof RectangleColore)
			return false;
		// On sait que obj est un rectangle (par l'instanceof)
		Rectangle rect = (Rectangle) obj;
		return (rect.largeur == this.largeur && this.hauteur == rect.hauteur);
	}

}
