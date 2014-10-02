import java.util.Scanner;
class App
{
	public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("Nama	: Dede Iskandar");
		System.out.println("NIM		: 1127050031");
		System.out.println(" ");
		
		Scanner scan=new Scanner(System.in);
		Linklist list=new Linklist();
		int pilih;
		
		do
		{	System.out.println();
			System.out.println(" 1. Tambah Depan");
			System.out.println(" 2. Tambah Belakang");
			System.out.println(" 3. Hapus Depan");
			System.out.println(" 4. Keluar");
			System.out.print(" Masukkan Pilihan Anda (1/2/3/4) : ");
			pilih=scan.nextInt();
			
			if(pilih==1)
			{
				System.out.print(" Masukkan Datanya --> : ");
				int a=scan.nextInt();
				list.tambahdepan(a);
				System.out.println();
				System.out.print(" Data : ");
				list.displayList();
				continue;
			}
			else if(pilih==2)
			{
				System.out.print(" Masukkan Datanya --> : ");
				int b=scan.nextInt();
				list.tambahbelakang(b);
				System.out.println();
				System.out.println(" Data : ");
				list.displayList();
				continue;
			}
			else if(pilih==3)
			{
				Node hapus;
				hapus=list.hapusdepan();
				System.out.println();
				System.out.println(" Data : ");
				list.displayList();
				continue;
			}
			else if(pilih>=5)
			{
				System.out.println(" Tidak Ada Pilihan No. "+pilih);
			}
		}
		while(pilih!=4);
	}
}