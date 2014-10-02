import java.util.Scanner;
class segitiga{
	public static void main(String[]args){
	float alas, tinggi;
	//menggunakan type data float agar user dapat menginputkan bilangan desimal
	double smiring, luas, keliling;;
	Scanner scn = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("\tSEGITIGA");
	System.out.println("==============================");
	System.out.print("Alas        = ");
	alas = scn.nextFloat();
	System.out.print("Tinggi      = ");
	tinggi = scn.nextFloat();
	smiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
	System.out.println("Sisi Miring = "+smiring);
	luas = alas * tinggi / 2;
	System.out.println("Luas        = "+luas);
	keliling = alas + tinggi + smiring;
	System.out.println("Keliling    = "+keliling);
	}
}