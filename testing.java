public class testing {
	public static void main(String[] args) {
		char[] p = {'a','b','c','d','e'};
		char[] x = upperCaseVersion (p);
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static char[] upperCaseVersion(char[] y){
		int i;
		for (i=0;i<y.length;i++)
			y[i]=Character.toUpperCase(y[i]);
		return y;
	}
}