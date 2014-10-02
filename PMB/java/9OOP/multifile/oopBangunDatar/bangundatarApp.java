import java.util.Scanner;
public class bangundatarApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		bangundatarOOP bd = new bangundatarOOP();
		garisenter ge = new garisenter();
		char c;
		do{
		ge.enter();
		ge.garis();
		ge.enter();
		System.out.println(" Program Bangun Datar");
		ge.enter();
		ge.garis();
		ge.enter();
		System.out.println(" Menu ");
		System.out.println(" 1. Segitiga");
		System.out.println(" 2. Segiempat");
		System.out.println(" 3. Segipanjang");
		System.out.println(" 4. Lingkaran");
		ge.enter();
		System.out.print(" Pilih Menu : ");
		int pilih = scn.nextInt();
		switch (pilih){
			case 1 	: bd.segi3OOP();
					break;
			case 2 	: bd.segi4OOP();
					break;
			case 3 	: bd.segipanjangOOP();
					break;
			case 4 	: bd.lingkaranOOP();
					break;
			default : System.out.println();
					break;
			}
		ge.enter();
		ge.garis();
		ge.enter();
		System.out.print(" Ulangi? (Y/T) : ");
		c = scn.next().charAt(0);
		}while (c=='Y'||c=='y');
	}
}