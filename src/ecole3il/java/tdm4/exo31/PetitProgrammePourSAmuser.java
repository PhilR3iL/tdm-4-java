package ecole3il.java.tdm4.exo31;

public class PetitProgrammePourSAmuser {
	public static void main(String[] args) {
		Couleur c1 = Couleur.BLEU;
		Couleur c2 = Couleur.ROUGE;
		if(c1 != c2) {
			Couleur c3 = c1;
			c1 = c2;
			c2 = c3;
		}
		System.out.println(c2);
		System.out.println(c1);
	}
}
