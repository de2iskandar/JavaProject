import java.util.Scanner;
class PMBApp {
	public static void main (String[] args) {
		Scanner scn = new Scanner (System.in);
		Scanner scr = new Scanner (System.in);
		OperasiPMB list = new OperasiPMB ();
		int menu;
		
		do {
			System.out.println("\n\n\n\n--------------------------------");
			System.out.println("PENERIMAAN MAHASISWA BARU \nPROGRAM STUDI TEKNIK INFORMATIKA \nFAKULTAS SAINS DAN TEKNOLOGI \nUIN SGD BANDUNG");
			System.out.println("================================\n");
			System.out.println("[1] DATA PENDAFTARAN KESELURUHAN");
			System.out.println("[2] TAMBAH PENDAFTAR");
			System.out.println("[3] CARI DATA");
			System.out.println("[4] UBAH DATA");
			System.out.println("[5] HAPUS DATA");
			System.out.println("[6] URUTKAN SEMUA PENDAFTAR");
			System.out.println("[7] KELUAR");
			System.out.println("--------------------------------\n");
			System.out.print("Pilih Menu : ");
			menu = scn.nextInt ();
			switch (menu) {
				case 1 : {
					list.displayList ();
					}
					break;
				case 2: {
					System.out.println("--------------------------------");
					System.out.println("FORM REGISTRASI MAHASISWA BARU");
					System.out.println("--------------------------------\n");
					System.out.print("Nomor Registrasi          : ");
					int reg = scn.nextInt ();
					System.out.print("Nama                      : ");
					String nama = scr.nextLine ();
					System.out.print("Jenis Kelamin [L/P]       : ");
					String jk = scr.nextLine ();
					System.out.print("Tempat Lahir              : ");
					String tmpLahir = scr.nextLine ();
					System.out.print("Tanggal Lahir [dd/mm/yyyy]: ");
					String tglLahir = scr.nextLine ();
					System.out.print("Alamat (Kota)             : ");
					String asal = scr.nextLine ();
					System.out.print("Asal Sekolah              : ");
					String aSek = scr.nextLine ();
					list.tambahData (reg, nama, jk, tmpLahir, tglLahir, asal, aSek);
					}
					break;
				case 3: {
					System.out.println("--------------------------------");
					System.out.println("CARI DATA MAHASISWA BARU");
					System.out.println("--------------------------------\n");
					System.out.print("Masukkan Reg : ");
					int reg = scn.nextInt ();
					if (list.cekData (reg)) {
						System.out.println("Data Ditemukan");
						list.displayCari ();
					}
					else
					System.out.println("Data tidak ditemukan");
					}
					break;
				case 4: {
					System.out.println("--------------------------------");
					System.out.println("UBAH DATA");
					System.out.println("--------------------------------\n");
					System.out.println("Ubah berdasarkan : ");
					System.out.println("[1] Nama");
					System.out.println("[2] Nomor Registrasi");
					System.out.print("Pilih : ");
					int pil = scn.nextInt ();
					if (pil==1) {
						System.out.println("========= UBAH NAMA ========\n");
						System.out.print("No Reg : ");
						int REG = scn.nextInt ();
						if (list.cekData (REG)) {
							System.out.print("Ubah Nama : ");
							String nama = scr.nextLine ();
							list.ubahNama (REG,nama);
							list.displayList ();
						}
						else
						System.out.println("Data yang dimasukkan salah");
					}
					else if (pil==2) {
						System.out.println("========= UBAH NO REG ========\n");
						System.out.print("No Reg : ");
						int REG = scn.nextInt ();
						if (list.cekData (REG)) {
							System.out.print("Ubah No Registrasi : ");
							int noReg = scn.nextInt ();
							list.ubahReg (REG,noReg);
							list.displayList ();
						}
						else
						System.out.println("Data yang dimasukkan salah");
					}
					else
					System.out.println("Data yang anda inputkan salah :");
					}
					break;
				case 5: {
					System.out.println("--------------------------------");
					System.out.println("HAPUS DATA MAHASISWA BARU");
					System.out.println("--------------------------------\n");
					System.out.print("Hapus Nomor Registrasi : ");
					int reg = scn.nextInt ();
					if (list.cekData (reg)) {
						list.hapusData (reg);
						System.out.println("Data Terhapus");
						list.displayList ();
					}
					else
					System.out.println("Data yang anda inputkan salah :");
					}
					break;
				case 6: {
					list.sortList ();
					list.displayList ();
					}
				}
		}while (menu!=7);
	}
}