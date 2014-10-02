class Sepeda {
	protected int kecepatan=0;
	protected int gir=0;

	void ubahGir (int pertambahanGir){
		gir=gir+pertambahanGir;
		System.out.println("Gir : "+gir);
	}

	void tambahKecepatan (int pertambahanKecepatan){
		kecepatan=kecepatan+pertambahanKecepatan;
		System.out.println("Kecepatan : "+kecepatan);
	}
}

class SepedaGunung extends Sepeda{
	void ubahGir(int pertambahanGir){
		gir=2*(gir+pertambahanGir);
		System.out.println("Gir : "+gir);
	}
}

class SepedaGunungAction{
	public static void main(String[] args) {
		SepedaGunung sepedaku=new SepedaGunung();
		sepedaku.tambahKecepatan(10);
		sepedaku.ubahGir(1);
	}
}