class OperasiPMB {
	private PMB head,tail,hasilcari;
	public OperasiPMB () {
		head = null;
	}

	public void tambahData (int a, String b, String c, String d, String e, String f, String g) {
		PMB baru = new PMB (a,b,c,d,e,f,g);
		PMB bantu;

		if (head==null) {
			head = baru;
			tail = baru;
		}
		else {
			for (bantu=head; bantu!=null; bantu=bantu.next) {
				if (bantu.noReg==a)
				break;
			}
			if (bantu==null) {
				tail.next = baru;
				tail = baru;
			}
			else
			System.out.println("\n\nNomor Registrasi " + a + " sudah ada");
		}
	}

	public boolean cekData (int cek) {
		PMB bantu;
		for (bantu=head; bantu!=null; bantu=bantu.next) {
			if (bantu.noReg==cek) {
				hasilcari = bantu;
				break;
			}
		}
		if (bantu==null)
		return false;
		else
		return true;
	}

	public void displayCari () {
		System.out.print("Nomor Registrasi    : " + hasilcari.noReg);
		System.out.print("\nNama                : " + hasilcari.namaSiswa +"  ");
		System.out.print("\nJenis Kelamin [L/P] : " + hasilcari.jenisKelamin +"  ");
		System.out.print("\nTempat Lahir        : " + hasilcari.tempatLahir +"  ");
		System.out.print("\nTanggal Lahir       : " + hasilcari.tanggalLahir +"  ");
		System.out.print("\nAlamat              : " + hasilcari.alamat +"  ");
		System.out.print("\nAsal Sekolah        : " + hasilcari.asalSekolah +"  ");
	}

	public void ubahNama (int cek, String nama) {
		PMB bantu;
		for (bantu=head; bantu!=null; bantu=bantu.next) {
			if (bantu.noReg==cek)
			break;
		}
		if (bantu!=null)
		bantu.setNama(nama);
	}
	
	public void ubahReg (int cek,int reg) {
		PMB bantu;
		for (bantu=head; bantu!=null; bantu=bantu.next) {
			if (bantu.noReg==cek)
			break;
		}
		if (bantu!=null)
		bantu.setReg(reg);
	}
	
	public PMB hapusData (int hapus) {
		PMB bantu,bantu2,temp;
		if (head!=null) {
			if (head.noReg == hapus) {
				temp = head;
				head = head.next;
				temp = null;
				return temp;
			}
			else {
				bantu = head;
				bantu2 = head;
				while (bantu.noReg!=hapus) {
					bantu = bantu.next;
					while (bantu2.next.noReg!=hapus) {
						bantu2 = bantu2.next;
					}
				}
				if (bantu==tail) {
					temp = tail;
					tail = bantu2;
					tail.next = null;
					return temp;
				}
				else {
					temp = bantu;
					bantu = bantu.next;
					bantu2.next = bantu;
					temp = null;
					return temp;
				}
			}
		}
		else {
			System.out.println("Data tidak ditemukan");
			return null;
		}
	}
	
	public void sortList () {
		PMB bantu, bantu2;
		int tempReg;
		String tempNama, tempJK, tempTmpLahir, tempTglLahir, tempAsal, tempASek;
		for (bantu=head; bantu!=null; bantu=bantu.next) {
			for (bantu2=bantu.next; bantu2!=null; bantu2=bantu2.next) {
				if (bantu2.noReg<bantu.noReg) {
					tempReg = bantu.noReg;
					bantu.noReg = bantu2.noReg;
					bantu2.noReg = tempReg;
					
					tempNama = bantu.namaSiswa;
					bantu.namaSiswa = bantu2.namaSiswa;
					bantu2.namaSiswa = tempNama;
					
					tempJK = bantu.jenisKelamin;
					bantu.jenisKelamin = bantu2.jenisKelamin;
					bantu2.jenisKelamin = tempJK;
					
					tempTmpLahir = bantu.tempatLahir;
					bantu.tempatLahir = bantu2.tempatLahir;
					bantu2.tempatLahir = tempTmpLahir;
					
					tempTglLahir = bantu.tanggalLahir;
					bantu.tanggalLahir = bantu2.tanggalLahir;
					bantu2.tanggalLahir = tempTglLahir;
					
					tempAsal = bantu.alamat;
					bantu.alamat = bantu2.alamat;
					bantu2.alamat = tempAsal;
					
					tempASek = bantu.asalSekolah;
					bantu.asalSekolah = bantu2.asalSekolah;
					bantu2.asalSekolah = tempASek;
				}
			}
		}
	}
	
	public void displayList () {
		if (head != null) {
			PMB bantu = head;
			int i = 1;
			System.out.print("\n============================\n\n");
			System.out.println("DATA MAHASISWA BARU");
			System.out.print("\n============================\n");
			System.out.println("No. Reg\t| Nama\t\t| L/P\t| Tempat,Tgl Lahir\t| Alamat\t| Asal Sekolah");
			System.out.println("----------------------------------------------------------------------------------------------");
			while (bantu!=null) {
				System.out.print(bantu.noReg);
				System.out.print("\t| " + bantu.namaSiswa);
				System.out.print("\t| " + bantu.jenisKelamin);
				System.out.print("\t| " + bantu.tempatLahir + ", " + bantu.tanggalLahir);
				System.out.print("\t| " + bantu.alamat);
				System.out.println("\t| " + bantu.asalSekolah);
				bantu = bantu.next;
				
				i++;
			}
			System.out.println("");
		}
		else
		System.out.println("List Kosong.");
	}
}