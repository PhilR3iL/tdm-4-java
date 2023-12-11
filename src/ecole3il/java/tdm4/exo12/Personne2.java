package ecole3il.java.tdm4.exo12;

import java.util.Objects;

/**
 * La classe Personne2 représente une personne avec son nom, prénom et numéro de sécurité sociale.
 */
public class Personne2 {
    private String nom;
    private String prenom;
    private String numeroDeSecu;

    /**
     * Constructeur de la classe Personne2.
     * 
     * @param nom Le nom de la personne.
     * @param prenom Le prénom de la personne.
     * @param numeroDeSecu Le numéro de sécurité sociale de la personne.
     */
    public Personne2(String nom, String prenom, String numeroDeSecu) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeSecu = numeroDeSecu;
    }

    /**
     * Obtient le nom de la personne.
     * 
     * @return Le nom de la personne.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient le prénom de la personne.
     * 
     * @return Le prénom de la personne.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Obtient le numéro de sécurité sociale de la personne.
     * 
     * @return Le numéro de sécurité sociale de la personne.
     */
    public String getNumeroDeSecu() {
        return numeroDeSecu;
    }

    /**
     * Calcule le hashcode de l'objet en utilisant le nom, le numéro de sécurité sociale et le prénom.
     * 
     * @return Le hashcode calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, numeroDeSecu, prenom);
    }

    /**
     * Vérifie si l'objet donné est égal à cette personne.
     * 
     * @param obj L'objet à comparer.
     * @return true si les objets sont égaux, sinon false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Personne2))
            return false;
        Personne2 other = (Personne2) obj;
        return Objects.equals(nom, other.nom) && Objects.equals(numeroDeSecu, other.numeroDeSecu)
                && Objects.equals(prenom, other.prenom);
    }
}
