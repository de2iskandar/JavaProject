public class Segitiga {
	// Atribut Segitiga
	private int alas;
	private int tinggi;

	// Method Segitiga
	public void setAlas (int a) {
		alas=a;
	}
	public void setTinggi (int t) {
		tinggi=t;
	}
	public int getAlas () {
		return alas;
	}
	public int getTinggi () {
		return tinggi;
	}
	public double luas(){
		double luas;
		luas=0.5*alas*tinggi;
		return  luas;
	}
}