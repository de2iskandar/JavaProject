public class OperasiBukuAlamat{
	public static void main(String[] args) {
		BukuAlamat jaka = new BukuAlamat(String nama, String alamat, String telp, String email);
		jaka.setNama="Jaka";
		jaka.setAlamat="Sekemala";
		jaka.setNoTelp="0857xxx";
		jaka.setEmail="jaka@bachelor.com";

		System.out.println("Nama : "+jaka.getNama);
		System.out.println("Alamat : "+jaka.getAlamat);
		System.out.println("No Telp : "+jaka.getNoTelp);
		System.out.println("No Telp : "+jaka.getEmail);
	}
}