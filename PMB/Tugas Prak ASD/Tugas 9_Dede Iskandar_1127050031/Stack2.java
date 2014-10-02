import java.util.Scanner;
import java.util.Stack;
public class Stack2 {
	public static void main (String[] args) {
		int banyak;
		Scanner sc = new Scanner (System.in);
		Stack stack = new Stack();
		
		System.out.print("Masukkan Jumlah Berapa Kali Push : ");
		banyak = sc.nextInt();
		System.out.println();
		
		String data;
		for (int x=1; x<=banyak; x++) {
			System.out.print("Data ke-"+x+" : ");
			data = sc.next();
			push(stack,data);
			System.out.println();
		}
		System.out.println("Semua Data Setelah Push "+stack);
	}
	static void push (Stack stack, String data) {
		stack.push (new String(data));
		System.out.println("Push (" +data+ ")");
		System.out.println("Setelah Di Push : "+stack);
	}
}