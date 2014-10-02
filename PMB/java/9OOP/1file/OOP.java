import java.util.Scanner;
class OOP{
	public static void main(String[]args){//Program Utama
		Scanner scn = new Scanner(System.in);
		int p,l;
		judul();
		persegi(p,l); //pemanggilan fungsi
		nama(); //pemanggilan fungsi
	}
	private int persegi(int panjang, int lebar){
	//variabel lokal
		int p,l,luas;
		System.out.print("Panjang = ");
		panjang = scn.nextInt();
		System.out.print("Lebar   = ");
		lebar = scn.nextInt();
		luas=panjang*lebar;
		System.out.println("Luas    = "+luas);
		return luas;
	//ada return value
	}
	private void nama(){
		System.out.println("==================================================");
		System.out.println("created by: Firdaus");
	}
	private void judul(){
		System.out.println("==================================================");
		System.out.println("\tMenghitung Luas Persegi Panjang");
		System.out.println("==================================================");
	}
}