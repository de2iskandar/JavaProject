import java.util.Scanner;
public class input1{
	public static void main(String [] args){
	Scanner scn = new Scanner(System.in);
	char huruf;
	String kata;
	int angka;
	System.out.print("Masukan Huruf = ");
	huruf = scn.next().charAt(0);
	System.out.print("Masukan Kata  = ");
	kata = scn.next();
	System.out.print("Masukan Angka = ");
	angka = scn.nextInt();
	System.out.println("========================================");
	System.out.println("OUTPUT");
	System.out.println("========================================");
	System.out.println("Huruf = "+huruf);
	System.out.println("Kata  = "+kata);
	System.out.println("Angka = "+angka);
	}
}