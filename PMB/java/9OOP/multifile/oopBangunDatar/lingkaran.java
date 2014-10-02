public class lingkaran {
	private int jari;
	
	public void setJari(int jari) {
		this.jari = jari;
	}
	public int getJari (){
		return jari;
	}
	public double hitungLuas(){
		double luas;
		luas = (22/7)*jari*jari;
		return luas;
	}
	public double keliling(){
		double KL;
		KL = (22/7)*(jari+jari);
		return KL;
	}
}	