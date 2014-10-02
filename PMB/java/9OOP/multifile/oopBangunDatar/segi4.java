public class segi4 {
	private int sisi;
	
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	public int getSisi (){
		return sisi;
	}
	public int hitungLuas(){
		int luas;
		luas = sisi*sisi;
		return luas;
	}
	public int keliling(){
		int KL;
		KL = 2 * (sisi + sisi);
		return KL;
	}
}	