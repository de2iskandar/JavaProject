public class segitigaOOP {
	private int alas;
	private int tinggi;
	private double sm;
	
	public void setAlas(int alas) {
		this.alas = alas;
	}
	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}
	public int getAlas (){
		return alas;
	}
	public int getTinggi(){
		return tinggi;
	}
	public double hitungLuas(){
		double luas;
		luas = 0.5*alas*tinggi;
		return luas;
	}
	public double sisimiring(){
		sm = Math.sqrt(tinggi*tinggi+alas*alas);
		return sm;
	}
	public double keliling(){
		double KL;
		KL = alas+ tinggi+ sm;
		return KL;
	}
	
}	