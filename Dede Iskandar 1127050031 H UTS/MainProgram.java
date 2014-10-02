import java.util.Scanner;
class MainProgram{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		Kamar kmr=new Kamar();
		Pemesanan psn=new Pemesanan();
		Kostumer kst=new Kostumer();
		
		System.out.println("[DEDE ISKANDAR]\n[UTS]");
		
		System.out.println("ID Kostumer\tNama Kostuer");
		System.out.println(kst.idKostumer[i]+"\t"+kst.namaKostumer[i]);
		
		System.out.println("Nomer Kamar : ");
		
		System.out.println("Jenis Kamar : "+kmr.noKamar[i]);
		System.out.println("Harga Sewa : "+kmr.noKamar[i]);
		System.out.println("Tanggal Masuk :");
		int tglMasuk = input.nextInt();
		System.out.println("Tanggal Keluar : ");
		int tglKeluar = input.nextInt();
		System.out.println("Lama Inap : "+psn.lamaInap());
		System.out.println("Total Harga : "+psn.totalHarga());
		System.out.println("Diskon : "+psn.diskon());
		System.out.println("Total Bayar : "+psn.totalBayar());
		System.out.println("Bayar : "+psn.bayar());
		System.out.println("Kembalian : "+psn.kembalian());
	}
}