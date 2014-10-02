public class BukuAlamat{
	private String nama;
	private String alamat;
	private String noTelp;
	private String email;

	public String getNama(){
		return nama;
	}

	public String getAlamat(){
		return alamat;
	}

	public String getNoTelp(){
		return noTelp;
	}

	public String getEmail(){
		return email;
	}

	public void setNama(String nama){
		nama=nama;
	}

	public  void setAlamat(String alamat){
		alamat=alamat;
	}

	public void setNoTelp(String noTelp){
		noTelp=noTelp;
	}

	public void setEmail(String email){
		email=email;
	}

	public BukuAlamat(String nm, String al, String tlp, String ml){
		this.nama=nm;
		this.alamat=al;
		this.noTelp=tlp;
		this.email=ml;
	}
	//area penulisan kode selanjutnya
}