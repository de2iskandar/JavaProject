import java.util.Scanner;
class UlangDoWhile{
	public static void main(String[]args){
	char repeat;
		do{
			int n, bil, i;
			double rata2, jumlah = 0;
			Scanner scn = new Scanner(System.in);	//Why Here
			System.out.println("========================================");
			System.out.println("\tMenghitung Rata-rata Nilai");
			System.out.println("========================================");
			System.out.print("Masukan Banyak Data = ");
			n = scn.nextInt();
			System.out.println("========================================");
			System.out.println("Masukan "+n+" Buah Bilangan");
				for(i=1; i<=n; i++){
					System.out.print("Bilangan ke-"+i+" = ");
					bil = scn.nextInt();
					jumlah = jumlah + bil;
				}
			rata2 = jumlah/n;
			System.out.println("========================================");
			System.out.println("Nilai Rata-rata = "+rata2);
			System.out.println("========================================");
			System.out.print("Hitung Lagi? (Y/T) = "); 
			repeat = scn.next().charAt(0);
			System.out.println("========================================");
		}while(repeat=='Y'||repeat=='y');
	}
}