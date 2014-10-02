import java.util.Scanner;
class PemilihanCase{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		short pilih;
		System.out.println("==================================================");
		System.out.println("\tNama Bulan (Masehi & Hijriyah)");
		System.out.println("==================================================");
		System.out.print("Nama bulan ke-(1-12) = ");
		pilih = scn.nextShort();
		System.out.println("==================================================");
		switch(pilih){
			case 1 	: System.out.println("Januari   / Muharram"); break;
			case 2 	: System.out.println("Februari  / Shafar"); break;
			case 3 	: System.out.println("Maret     / Rabiul Awal"); break;
			case 4 	: System.out.println("April     / Rabiutsani"); break;
			case 5 	: System.out.println("Mei       / Jumadil Awal"); break;
			case 6 	: System.out.println("Juni      / Jumaditsani"); break;
			case 7 	: System.out.println("Juli      / Rajab"); break;
			case 8 	: System.out.println("Agustus   / Sya'ban"); break;
			case 9 	: System.out.println("September / Rhamadhan"); break;
			case 10 : System.out.println("Oktober   / Syawal"); break;
			case 11 : System.out.println("November  / Dzulqaidah"); break;
			default : System.out.println("Desember  / Dzulhijjah"); break;
		}
	}
}