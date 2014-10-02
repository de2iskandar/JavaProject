class Pemesanan extends Kamar{
	penyewaan(String noKamar){
		super(noKamar);
	}

	public String getJenisKamar(){
		return getKamar(noKamar, 0);
	}

	public String getHarga(){
		return Integer.parseInt(getKamar(noKamar,2));
	}

	public String getDiskon(int lamaInap){
		if(lamaSewa <=Integer.parseInt(getKamar(noKamar,3))){
			diskon=0;
			return diskon;
		}
	}

	public String lamaInap(){
		return tanggalMasuk-tanggalKeluar;
	}

	public String totalBayar(){
		return getHarga()+getDiskon;
	}

	public String totalHarga(){
		return getHarga()*lamaInap()
	}

	public String Kembalian(){
		return bayar-totalBayar();
	}

}