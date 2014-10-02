import java.util.Scanner;
public class Tgsno2 {

	public static void main(String[] args)
	{
		System.out.println("Nama : Dede Iskandar");
		System.out.println("NIM : 1127050031");
		Scanner scan=new Scanner(System.in);
		int[] A=new int[50];
		int N,i,j,cari;
		
		System.out.print(" Masukan banyak data : ");
		N=scan.nextInt();
		System.out.println();
		
		for(i=1;i<=N;i++)
		{
			System.out.print(" Input nilai ke ["+i+"] : ");
			A[i]=scan.nextInt();
		}
		System.out.println();
		
		//pengurutan dengan bubble sort
		for(i=1;i<=N;i++)
		{
			for(j=2;j<=N;j++)
			{
				if(A[j-1]>A[j])
				{
					int aa=A[j-1];
					A[j-1]=A[j];
					A[j]=aa;
				}
			}
		}
		
		System.out.print(" Masukan nilai yg ingin di cari : ");
		cari=scan.nextInt();
		System.out.println();
		
		System.out.println(" "+search(A,cari,N));
		
	}
	public static String search(int[]a,int x,int N)
	{
		int ba=1;
		int bb=N;
		while(ba<=bb)
		{
			int tengah=(ba+bb)/2;
			if(a[tengah]==x)
			{
				return " Bilangan "+x+" ada pada index ke ["+tengah+"]";
			}
			if(a[tengah]<x)
			{
				ba=tengah+1;
			}
			else
			{
				bb=tengah;
			}
		}
		return " Bilangan "+x+" tidak ada pada array";
	}
}
	