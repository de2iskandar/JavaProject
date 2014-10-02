import java.util.Scanner;

public class OOPsegitiga {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		segitigaOOP segi3 = new segitigaOOP();
		System.out.println("============================================");
		System.out.print("Masukan alas segitiga   = ");
		int a = scn.nextInt();
		segi3.setAlas(a);
		System.out.print("Masukan tinggi segitiga = ");
		int t = scn.nextInt();
		segi3.setTinggi(t);
		System.out.println("============================================");
		System.out.println("Alas segitiga         = " + segi3.getAlas());
		System.out.println("Tinggi segitiga       = " + segi3.getTinggi());
		System.out.println("Sisi miring segitiga  = " + segi3.sisimiring());
		System.out.println("Keliling segitiga     = " + segi3.keliling());
		System.out.println("Luas segitiga         = " + segi3.hitungLuas());
		System.out.println("============================================");
	}
}