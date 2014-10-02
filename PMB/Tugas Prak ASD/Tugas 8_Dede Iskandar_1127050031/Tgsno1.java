import java.util.Scanner;
import java.io.*;
public class Tgsno1 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("Nama : Dede Iskandar");
		System.out.println("NIM : 1127050031");
		Scanner scan=new Scanner(System.in);
		char[] A;
		int[] temp=new int[50];
		A=new char [50];
		char x;
		int N,i;
		boolean ada;
		
		System.out.print(" Masukan banyak data : ");
		N=scan.nextInt();
		System.out.println();
		for(i=1;i<=N;i++)
		{
			System.out.print(" Input hurup ke ["+i+"] : ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			A[i] = (char) br.read();
		}
		System.out.println();
		System.out.print(" Masukan huruf yang ingin di cari : ");
		InputStreamReader aa = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(aa);
		x = (char) br.read();
		
		ada=false;
		for(i=1;i<=N;i++)
		{
			if(A[i]==x)
			{
				ada=true;
				temp[i]=i;
			}
		}
		
		if(ada)
		{
			System.out.print(" Huruf yang dicari berada di indeks ");
			for(i=1;i<=N;i++)
			{
				if((ada)&&(temp[i]!=0))
				{
					System.out.print(" "+temp[i]);
					if(temp[i]!=N)
					{
						System.out.print(" , ");
					}
					else
					{
						System.out.print("");
					
					}
				}
			}
		}
		else
		{
			System.out.println(" Tidak ada pada array");
		}
	}
}