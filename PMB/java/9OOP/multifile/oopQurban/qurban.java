import java.util.Scanner;
// awal class qurban
public class qurban{
	public static void main (String [] args){
		//atribut
		char ulang;
		float beratDaging, jmlMustahiq, qurban, mustahiq;
		//Pembentukan Objek
		Scanner scn = new Scanner (System.in);
		qurbanOOP qr = new qurbanOOP();
		garisEnter ge = new garisEnter();
		do{
			ge.enter(); //memanggil method enter
			ge.garis(); //memanggil method garis
			ge.enter();
			System.out.println(" Aplikasi Penghitung Pembagian Daging Qurban ");
			ge.garis();
			ge.enter();
			ge.enter();
			System.out.print(" Masukan Berat Daging Qurban (kg) = ");
			beratDaging = scn.nextFloat();
			//memanggil method beratDaging
			qr.beratDaging(beratDaging);
			System.out.print(" Masukan Jumlah Mustahiq  (orang) = ");
			jmlMustahiq = scn.nextFloat();
			//memanggil method jmlMustahiq
			qr.jmlMustahiq(jmlMustahiq);
			ge.enter();
			ge.garis();
			ge.enter();
			ge.enter();
			System.out.println(" Jumlah daging untuk pengqurban   = " + qr.pengqurban() + " kg");
			System.out.println(" Jumlah daging untuk 1 mustahiq   = " + qr.mustahiq() + " kg");
			ge.enter();
			ge.garis();
			ge.enter();
			System.out.print(" Hitung Lagi ? ( Y/T ) : ");
			ulang = scn.next().charAt(0);
			ge.enter();
			ge.enter();
			ge.enter();
			ge.enter();
			ge.enter();
		} while (ulang=='y'||ulang=='Y');
	}
} // akhir class Qurban