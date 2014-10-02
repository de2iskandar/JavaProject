class PMB {
	public int noReg;
	public String namaSiswa;
	public String jenisKelamin;
	public String tempatLahir;
	public String tanggalLahir;
	public String alamat;
	public String asalSekolah;
	public PMB next;
	
	public PMB (int reg, String nama, String jk, String tmpLahir, String tglLahir, String asal, String aSek) {
		noReg = reg;
		namaSiswa = nama;
		jenisKelamin = jk;
		tempatLahir = tmpLahir;
		tanggalLahir = tglLahir;
		alamat = asal;
		asalSekolah = aSek;
		next = null;
	}
	
	public void setNama (String nama) {
		namaSiswa = nama;
	}
	
	public void setReg (int reg) {
		noReg = reg;
	}
}