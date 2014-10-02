import java.text.DecimalFormat;

interface gaji{
	public double getGaji();
}

class HitungGaji{
	public static void main(String[] args) {
		test();
	}

	static void test(){
		DecimalFormat df=new DecimalFormat("0,000");
		System.out.println("\nHitung Gaji\n============================");

		Staff st=new Staff("Dede",10000);
		System.out.println("Nama    : "+st.getNama());
		System.out.println("Jabatan : "+st.getJabatan());
		System.out.println("Gaji    : Rp. "+df.format(st.getGaji()));

		ManagerOperasional manOp=new ManagerOperasional("Didi",10000);
		System.out.println("\nNama    : "+manOp.getNama());
		System.out.println("Jabatan : "+manOp.getJabatan());
		System.out.println("Gaji    : Rp. "+df.format(manOp.getGaji()));

		ManagerKeuangan manKeu=new ManagerKeuangan("Dudu",10000);
		System.out.println("\nNama    : "+manKeu.getNama());
		System.out.println("Jabatan : "+manKeu.getJabatan());
		System.out.println("Gaji    : Rp. "+df.format(manKeu.getGaji()));
	}
}

class Karyawan{
	protected String nama;
	protected String jabatan;
	protected double gaji;
	
	public Karyawan(){

	}
	
	public String getNama(){
		return nama;
	}

	public String getJabatan(){
		return jabatan;
	}

	public double getGaji(){
		return gaji;
	}

	public void setJabatan(String jabatan){
		this.jabatan=jabatan;
	}
}

class Staff extends Karyawan{
	public Staff(String nama, double gaji){
		this.setJabatan("Staff");
		this.nama=nama;
		this.gaji=gaji;
	}
}

class Manager extends Karyawan{
	public Manager(String nama, double gaji){
		this.nama=nama;
		this.gaji=gaji;
	}
	public double getGaji(){
		return gaji+5000;
	}
}

class ManagerOperasional extends Manager{
	public ManagerOperasional(String nama, double gaji){
		super(nama, gaji);
		this.setJabatan("Manager Operasional");
	}

	public double getGaji(){
		return gaji+2000;
	}
}

class ManagerKeuangan extends Manager{
	public ManagerKeuangan(String nama, double gaji){
		super(nama, gaji);
		this.setJabatan("Manager Keuangan");
	}

	public double getGaji(){
		return gaji+3000;
	}
}