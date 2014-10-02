import java.util.Scanner;
class InsertionSortApp{
	public static void main (String[]args){
	int maxSize = 20;
	myinsertion arr = new myinsertion (maxSize);
	System.out.println("================================");
	System.out.println("	Insertion Sort");
	System.out.println("================================");
	System.out.println("Masukan 10 Angka");
	System.out.println();
	Scanner scn = new Scanner (System.in);
		for (int i=0; i<10; i++){
			System.out.print("Masukan Angka ke-"+(i+1)+" = ");
			arr.insert (scn.nextInt());
		}
	System.out.println();
	System.out.println("================================");
	System.out.println("Angka sebelum diurutkan");
	arr.display (); 		//sebelum diurutkan
	arr.InsertionSort(); 	//Insertion sort
	System.out.println("================================");
	System.out.println("Angka setelah diurutkan");
	arr.display ();			//setelah diurutkan
	}
}