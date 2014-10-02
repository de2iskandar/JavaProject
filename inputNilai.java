import java.util.Scanner;
public class inputNilai{
	public SegiTiga(){
		Scanner scn = new Scanner(System.in);
		Segitiga segi3=new Segitiga(); // membuat objek segitiga
		System.out.print("Masukan Alas Segitiga : ");
		int a=scn.nextInt();
		segi3.setAlas(a);
		System.out.print("Masukan Tinggi Segitiga : ");
		int t=scn.nextInt();
		segi3.setTinggi(t);

		System.out.println("Luas : "+segi3.luas());

	}
}