package ecole3il.java.tdm4.exo12;

import java.util.Objects;

public class Personne {
	private String nom;
	public Personne(String nom, String prenom, String numeroDeSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeSecu = numeroDeSecu;
	}
	@Override
	public String toString() {
		return nom.toUpperCase() + " " + prenom + " : " + numeroDeSecu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom, numeroDeSecu, prenom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Personne))
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(nom, other.nom) && Objects.equals(numeroDeSecu, other.numeroDeSecu)
				&& Objects.equals(prenom, other.prenom);
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getNumeroDeSecu() {
		return numeroDeSecu;
	}
	private String prenom;
	private String numeroDeSecu;
	public boolean estHomme() {
		return numeroDeSecu.charAt(0) == '1';
	}
	
}
