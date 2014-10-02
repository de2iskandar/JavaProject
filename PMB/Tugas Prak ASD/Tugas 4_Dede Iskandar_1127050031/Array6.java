import java.io.*;
public class Array6{
	public static void main(String[]args){ //program pencarian (searching) array
		BufferedReader bilangan=new BufferedReader(new InputStreamReader(System.in));
		try{
			int tanda=0;
			int [] angka;
			angka=new int[9];
			System.out.println("masukkan 5 buah angka");
			System.out.println("=====================");
   
			for (int i=0;i < angka.length;i++){
				System.out.print("masukkan data ke "+i+"=");
				angka[i]=Integer.parseInt(bilangan.readLine());
			}
			
			System.out.println("");
			System.out.print("Masukkan Angka yang Dicari : ");
			int cari=Integer.parseInt(bilangan.readLine());
   
			for(int j=0;(j < angka.length && tanda == 0);j++){
				if (cari == angka[j])
					tanda++;
			}
		
			if (tanda > 0){
				System.out.println("");
				System.out.println("Bilangan ditemukan pada indeks ke-1");
			}else{
				System.out.println("");
				System.out.println("Maaf Bilangan yang Anda Cari Tidak Ada");
			}
		}
		
catch(Exception e){
    System.out.println("salah");}
    }
}