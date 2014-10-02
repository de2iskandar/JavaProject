import java.util.Scanner;
class searching{
	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		int data[] = {4, 1, 0, -9, 8, 5, -1, 2, 3, -7};
		int elemen, ketemu, x;
		System.out.print("Data yang dicari = ");
		x = scn.nextInt();
		ketemu = 0;
		for(elemen=0; elemen<= 9; elemen++){
			if (data[elemen] == x){
				ketemu = ketemu + 1;
				break;
			}
		}
		if (ketemu == 0) System.out.println("Data tidak ditemukan");
		else System.out.println("Data ada di elemen = "+elemen);
	}
}