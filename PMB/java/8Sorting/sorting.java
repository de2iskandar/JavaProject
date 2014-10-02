import java.util.Scanner;
class sorting{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		int array[] = new int[10];
		int temp,i,j;
		System.out.println("========================================");
		System.out.println("\tPengurutan Bilangan Ascending");
		System.out.println("========================================");
		for(i=0; i<10; i++){
			System.out.print("Masukan bilangan ke-"+(i+1)+" = ");
		   array[i] = scn.nextInt();
		   }

		System.out.println("========================================");
		System.out.println("\tSebelum Pengurutan");
		System.out.println("========================================");
		for(i=0; i<10; i++){
			System.out.print(array[i]+" ");
		   }
		System.out.println("\n========================================");
		System.out.println("\tHasil Pengurutan Bilangan");
		System.out.println("========================================");
		for (i=0;i<10;i++){
			for (j=0;j<9;j++){
			if (array[j+1]<array[j]){
				temp = array[j];
				 array[j]=array[j+1];
				 array[j+1]=temp;
			  }
		   }
		}
		for(i=0; i<10; i++){
			System.out.println("Bilangan ke-"+(i+1)+" = "+array[i]);
		}
	}
}