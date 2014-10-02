import java.util.Scanner;
class bangundatarOOP {
	public void segi3OOP() {
		Scanner scn = new Scanner (System.in);
		segi3 s3 = new segi3();
		enter();
		garis();
		enter();
		System.out.print(" Masukan alas segitiga   : ");
		int a = scn.nextInt();
		s3.setAlas(a);
		System.out.print(" Masukan tinggi segitiga : ");
		int t = scn.nextInt();
		s3.setTinggi(t);
		enter();
		garis();
		enter();
		System.out.println(" alas segitiga        = " + s3.getAlas());
		System.out.println(" tinggi segitiga      = " + s3.getTinggi());
		System.out.println(" Sisi miring segitiga = " + s3.sisimiring());
		System.out.println(" Keliling segitiga    = " + s3.keliling());
		System.out.println(" Luas segitiga        = " + s3.hitungLuas());
	}
	public void segi4OOP() {
		Scanner scn = new Scanner (System.in);
		segi4 s4 = new segi4();
		enter();
		garis();
		enter();
		System.out.print(" Masukan sisi segiempat : ");
		int s = scn.nextInt();
		s4.setSisi(s);
		enter();
		garis();
		enter();
		System.out.println(" Sisi segiempat     = " + s4.getSisi());
		System.out.println(" Keliling segiempat = " + s4.keliling());
		System.out.println(" Luas segiempat     = " + s4.hitungLuas());
	}
	public void segipanjangOOP() {
		Scanner scn = new Scanner (System.in);
		segipanjang spanjang = new segipanjang();
		enter();
		garis();
		enter();
		System.out.print(" Masukan panjang : ");
		int p = scn.nextInt();
		spanjang.setPanjang(p);
		System.out.print(" Masukan lebar   : ");
		int l = scn.nextInt();
		spanjang.setLebar(l);
		enter();
		garis();
		enter();
		System.out.println(" Panjang segipanjang  = " + spanjang.getPanjang());
		System.out.println(" Lebar segipanjang    = " + spanjang.getLebar());
		System.out.println(" Keliling segipanjang = " + spanjang.keliling());
		System.out.println(" Luas segipanjang     = " + spanjang.hitungLuas());
	}
	public void lingkaranOOP() {
		Scanner scn = new Scanner (System.in);
		lingkaran lingk = new lingkaran();
		enter();
		garis();
		enter();
		System.out.print(" Masukan jari-jari lingkaran : ");
		int j = scn.nextInt();
		lingk.setJari(j);
		enter();
		garis();
		enter();
		System.out.println(" Jari-jari lingkaran = " + lingk.getJari());
		System.out.println(" Keliling lingkaran  = " + lingk.keliling());
		System.out.println(" Luas lingkaran      = " + lingk.hitungLuas());
	}
}