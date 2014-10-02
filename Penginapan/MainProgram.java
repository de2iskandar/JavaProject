import java.util.Scanner;
class MainProgram{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Pemesanan pesan=new Pemesanan();
		Kostumer pelanggan=new Kostumer();
		System.out.println("Dede Iskandar");
		System.out.println("1127050031");
		System.out.println("---------------------------\n\n");

		System.out.println("ID Kostumer\tNama Kostumer");

		System.out.println();

		System.out.println("Nomer Kamar\t");

		System.out.println("Jenis Kamar\t");
		System.out.println("Harga Sewa\t");
		System.out.println("Tanggal Masuk\t");
		System.out.println("Tanggal Keluar\t");
		System.out.println("Lama Inap\t"+pesan.lamaInap());
		int inap=input.nextInt();

		System.out.println("Total Harga\t");
		System.out.println("Diskon\t");
		System.out.println("Total Bayar\t"+pesan.totalBayar());
		System.out.print("Bayar\t");
		int bayar=input.nextInt();
		System.out.println("Kembalian\t"+pesan.kembalian());
	}
}