import java.util.Scanner;
import java.util.Stack;
public class JavaTumpuk {
	public static void main (String[] args) {
		int banyak, pilih, data, x, z;
		Stack stack = new Stack();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Input Ukuran Stack : ");
		banyak = sc.nextInt();
		x = 1;
		z = banyak;
		do {
			System.out.print("\n1. Tambah Data Stack\n2. Ambil Data Stack\n3. Lihat Data Stack\n4. Keluar\nPilihan Anda -->> : ");
			pilih = sc.nextInt();
			if (pilih==1) {
				if (x<=banyak) {
					System.out.print("\nDatanya -->> : ");
					data = sc.nextInt();
					stack.push(data);
					x++;
				}
				else {
					System.out.print("Stack Maximal "+banyak);
				}
			}
			if (pilih==2) {
				if (z>0) {
					stack.pop();
					z--;
				}
				else {
					System.out.print("Stack Sudah Kosong");
				}
			}
			if (pilih==3) {
				System.out.print("\n "+stack);
				System.out.println();
			}
			if (pilih==4) {
				break;
			}
		}
		while (pilih!=4);
	}
}