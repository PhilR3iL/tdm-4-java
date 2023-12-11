package ecole3il.java.tdm4.exo41;

public class Chien extends Animal implements PeutCrier {

	@Override
	public void crier() {
		System.out.println("OUAF !");
	}

}
