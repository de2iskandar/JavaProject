class Pemesanan extends Kamar{
	public int lamaInap(){
		return tanggalMasuk-tanggalKeluar;
	}
	
	public int totalHarga(){
		return hargaSewa[i]*lamaInap();
	}
	
	public int diskon(){
		return totalHarga()*persenDiskon[];
	}
	
	public int totalBayar(){
		return totalHarga()-diskon();
	}
	
	public int kembalian(){
		return bayar-totalBayar();
	}
}