import java.util.Scanner;
import java.util.Stack;
public class Stack1 {
	public static void main (String[] args) {
		int banyak, data, dataStack;
		Stack <Integer> stack;
		Scanner sc = new Scanner (System.in);
		stack = new Stack <Integer> ();
		
		System.out.print("Masukkan Banyak Stack : ");
		banyak = sc.nextInt();
		System.out.println();
		System.out.println("Masukkan Nilai-Nilai Stack =\n");
		for (int i=1; i<=banyak; i++) {
			System.out.print("Data Ke-"+i+" : ");
			data = sc.nextInt();
			stack.push(data);
		}
		System.out.println();
		System.out.println("Isi Stack\n");
		for (int i=1; i<=banyak; i++) {
			dataStack = stack.pop();
			System.out.println("Nilai Stack : "+dataStack);
		}
	}
}