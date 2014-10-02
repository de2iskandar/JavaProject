import java.text.DecimalFormat;

public class DemoEnkapsulasi {

	public static void main(String[] args) {
		DecimalFormat digitpresisi = new DecimalFormat("0,000");
		System.out.println("\nDEMO ENKAPSULASI");
		HitungGaji tony = new HitungGaji();
		tony.setGaji(25000000);
		tony.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "
			+digitpresisi.format(tony.getGajiKotor()));
		System.out.println("\nBesar Gaji yang dibawa pulang : "
			+digitpresisi.format(tony.getGajiBersih()));

		HitungGaji tona = new HitungGaji();
		tona.setGaji(10000000);
		tona.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "
			+digitpresisi.format(tona.getGajiKotor()));
		System.out.println("\nBesar Gaji yang dibawa pulang : "
			+digitpresisi.format(tona.getGajiBersih()));
	}	
}
