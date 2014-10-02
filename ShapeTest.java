class Shape{
	private String shapeName="Tidak ada nama shape";
	private double sisiA=1;
	private double sisiB=2;
	protected double alas;
	protected double tinggi;
	protected double panjang;
	protected double lebar;
	protected double jejari;

	public double luas(){
		return sisiA*sisiB;
	}

	public String shapeInfo(){
		return shapeName;
	}

	public void setName(String name){
		this.shapeName=name;
	}
}

class Segitiga extends Shape{
	public Segitiga (double alas, double tinggi){
		this.setName("Segitiga");
		this.alas=alas;
		this.tinggi=tinggi;
	}
	@Override
	public double luas(){
		return 0.5*alas*tinggi;
	}
}

class Segiempat extends Shape{
	public Segiempat (double panjang, double lebar){
		this.setName("Segiempat");
		this.panjang=panjang;
		this.lebar=lebar;
	}
	@Override
	public double luas(){
		return panjang*lebar;
	}
}

class Lingkaran extends Shape{
	public Lingkaran (double r){
		this.setName("Lingkaran");
		this.jejari=r;
	}
	@Override
	public double luas(){
		return Math.PI*jejari*jejari;
	}
}

class VolBalok extends Segiempat{
	public double tinggi;
	public VolBalok (double panjang, double lebar, double tinggi){
		super(panjang, lebar);
		this.setName("Balok");
		this.tinggi=tinggi;
	}

	public double volume(){
		return luas()*tinggi;
	}
}

class ShapeTest{
	public static void main(String[] args) {
		System.out.println("\t\t Objek Shape");
		Shape sh=new Shape();
		System.out.println(sh.shapeInfo());
		System.out.println(sh.luas());

		System.out.println("\t\t Segitiga");
		Segitiga st=new Segitiga(6,7);
		System.out.println(st.shapeInfo());
		System.out.println(st.luas());

		System.out.println("\t\t Segiempat");
		Segiempat se=new Segiempat(4,5);
		System.out.println(se.shapeInfo());
		System.out.println(se.luas());

		System.out.println("\t\t Balok");
		VolBalok vb=new VolBalok(10,5,4);
		System.out.println(vb.shapeInfo());
		System.out.println(vb.volume());
	}
}