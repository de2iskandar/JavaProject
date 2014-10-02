import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Turunan{
	public static void main(String[] args) throws IOException{
		String sInput=null;
		System.out.println("Jenis mamalia :");
		System.out.println("[1]. IKAN PAUS");
		System.out.println("[2]. CHEETAH");	
		System.out.println("[3]. SAPI");
		System.out.print("Masukan pilihan [1/2/] : ");
		Mamalia generalx=new Mamalia();
		Paus turunan1=new Paus();
		Cheetah turunan2=new Cheetah();
		Sapi turunan3=new Sapi();
		InputStreamReader inputan = new InputStreamReader(System.in);
		BufferedReader jm=new BufferedReader(inputan);
		sInput=jm.readLine();
		int i=Integer.parseInt(sInput);
		switch (i) {
			case 1 :
				generalx.KelasMamalia();
				turunan1.tampilkanPaus();
				break;
			case 2 :
				generalx.KelasMamalia();
				turunan2.tampilkanCheetah();
				break;
			case 3 :
				generalx.KelasMamalia();
				turunan3.tampilkanSapi();
				break;
			default:
				System.out.println("Menu yang anda masukan salah!");
				break;
		}
	}
}