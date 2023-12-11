package ecole3il.java.tdm4.exo41;

public class MaisonDeMartine {
	public static void main(String[] args) {
		PeutCrier[] machinsQuiCrient = new PeutCrier [3];
		machinsQuiCrient[0] = new Chien();
		machinsQuiCrient[1] = new Chat();
		machinsQuiCrient[2] = new Chien();
		for (PeutCrier trucQuiPeutCrier : machinsQuiCrient) {
			trucQuiPeutCrier.crier();
		}
	}
}
