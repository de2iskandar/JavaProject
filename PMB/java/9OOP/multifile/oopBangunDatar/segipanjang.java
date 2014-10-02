public class segipanjang {
	private int panjang;
	private int lebar;
	
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	public int getPanjang (){
		return panjang;
	}
	public int getLebar(){
		return lebar;
	}
	public int hitungLuas(){
		int luas;
		luas = panjang*lebar;
		return luas;
	}
	public int keliling(){
		int KL;
		KL = 2 * (panjang + lebar);
		return KL;
	}
	
}	