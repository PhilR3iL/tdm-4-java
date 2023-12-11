package ecole3il.java.tdm4.exo32;

public enum Suite {
	UT,
	RE,
	MI,
	FA,
	SOL,
	LA,
	SI;
	
	public static void main(String[] args) {
		for(Suite note : Suite.values()) {
			System.out.println(note);
		}
	}
	
}
