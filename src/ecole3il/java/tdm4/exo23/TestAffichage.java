package ecole3il.java.tdm4.exo23;

public class TestAffichage {
	
	public static void main(String[] args) {

		A aa = new A();
		B bb = new B();
		A ab = bb;
						// A (ref A) -> A (ref A)
						// x.bin(y)
						// x : type dynamique, type de la référence
		System.out.println(aa.bin_A(aa));
		System.out.println(aa.bin_B(bb));
		System.out.println(aa.bin_A(ab));
		
		System.out.println(bb.bin_A(aa));
		System.out.println(bb.bin_B(bb));
		System.out.println(bb.bin_A(ab));
		
		System.out.println(ab.bin_A(aa));
		System.out.println(ab.bin_B(bb));
		System.out.println(ab.bin_A(ab));
	}
}
