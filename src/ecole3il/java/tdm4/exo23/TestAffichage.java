package ecole3il.java.tdm4.exo23;

public class TestAffichage {
	
	public static void main(String[] args) {

		A aa = new A();
		B bb = new B();
		A ab = bb;
						// A (ref A) -> A (ref A)
						// x.bin(y)
						// x : type dynamique, type de la référence
		System.out.println(aa.bin(aa));
		System.out.println(aa.bin(bb));
		System.out.println(aa.bin(ab));
		
		System.out.println(bb.bin(aa));
		System.out.println(bb.bin(bb));
		System.out.println(bb.bin(ab));
		
		System.out.println(ab.bin(aa));
		System.out.println(ab.bin(bb));
		System.out.println(ab.bin(ab));
	}
}
