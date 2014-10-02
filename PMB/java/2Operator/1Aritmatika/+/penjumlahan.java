import java.util.Scanner;
class penjumlahan{
	public static void main(String [] args){
	byte b = 127;
	//byte -128 to 127
	short s = 32767;
	//short -32.768 to 32.767
	int i = 2147483647;
	//integer –2.147.483.648 to 2.147.483.647
	long l = 9223372036854775807L;
	//long –9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
	float f = 2.12345678F;
	//float 7 angka dibelakang koma (untuk bilangan desimal)
	double d = 2.1234567891234567;
	//double 15 angka dibelakang koma (untuk bilangan desimal)
	System.out.println("byte    = "+b);
	System.out.println("short   = "+s);
	System.out.println("integer = "+i);
	System.out.println("long    = "+l);
	System.out.println("float   = "+f);
	System.out.println("double  = "+d);
	System.out.println("========================================");
	System.out.println("PENJUMLAHAN");
	System.out.println("========================================");
	double jumlah = 2011 + 2.12345678F;
	System.out.println("jumlah  = "+jumlah);
	}
}