import java.util.Scanner;
public class JumMatrix
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int i; 
		Int j;
		int[][] matrixA=new int[2][2];
		int[][] matrixB=new int[2][2];
		int[][] jumlahmatrix= new int[2][2];
		int[][] kurangmatrix=new int[2][2];
		//input matrix A
		for(i=0;i<2;i++)
		{
		      for(j=0;j<2;j++)
			{
			System.out.print("matrix A "+i+"."+j+"= ");
		matrixA[i][j]=input.nextInt();
			}
		}
		System.out.println();

		//input matrix B
		for(i=0;i<2;i++)
		{
				for(j=0;j<2;j++)
			{
				System.out.print("matrix B "+i+"."+j+"= ");
				matrixB[i][j]=input.nextInt();
			}
		}
		//penjumlahan matrix
		for(i=0;i<2;i++)
		{
		for(j=0;j<2;j++)
		{
			jumlahmatrix[i][j]=matrixA[i][j]+matrixB[i][j];			
		}
	}
	
	//tampilkan jumlahmatrix
	System.out.println("\nMatrixA + Matrix B \n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		   System.out.print(" "+jumlahmatrix[i][j]);			
		}
		System.out.println();
	}
		
       }
}

