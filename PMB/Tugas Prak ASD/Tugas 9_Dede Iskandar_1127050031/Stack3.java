import java.util.Scanner;
import java.util.Stack;
public class Stack3 {
	public static void main (String[] args) {
		int banyakpush,banyakpop;
		String data;
		Scanner sc = new Scanner (System.in);
		Stack stack = new Stack();
		
		System.out.print("Masukkan Jumlah Banyak Push ? : ");
		banyakpush = sc.nextInt();
		System.out.println();
		for (int x=1; x<=banyakpush; x++) {
			System.out.print("Data ke-"+x+" : ");
			data = sc.next();
			push(stack,data);
			System.out.println();
		}
		System.out.print("Masukkan Jumlah Banyak POP : ");
		banyakpop = sc.nextInt();
		System.out.println();
		for (int x=1; x<=banyakpop; x++) {
			pop(stack,x);
		}
	}
	static void push (Stack stack, String data) {
		stack.push (new String(data));
		System.out.println("Push (" +data+ ")");
		System.out.println("Setelah Di Push : "+stack);
	}
	static void pop (Stack stack,int i) {
		String data = (String) stack.pop();
		System.out.println("Data Stack Setelah Di POP "+i+" : "+stack);
	}
}	