import java.util.Scanner;
class PemilihanIf{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		int tahun;
		System.out.println("================================");
		System.out.println("\tTAHUN KABISAT");
		System.out.println("================================");
		System.out.print("Masukan Tahun = "); 
		tahun = scn.nextInt();
			if (tahun%4==0){
			System.out.println(tahun+" merupakan tahun kabisat");
			}
			else{
			System.out.println(tahun+" bukan tahun kabisat");
			}
	}	
}