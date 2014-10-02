public class angka{
	public static void main(String[] args) {
		angka.overloading("JAVA");
		angka.overloading(4);
	}

	public static void overloading(String kalimat){
		int i;
		for (i=1;i<=kalimat.length();i++) {
			System.out.println(kalimat.substring(0,i));
		}
	}

	public static void overloading(int angka){
		int i,j;
		for (i=1;i<=angka;i++) {
			for (j=1;j<=1;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}