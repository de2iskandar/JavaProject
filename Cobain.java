public class Cobain {
	public static void main(String[] args) {
		String[][]dogs ={{"Ucing","Anjing","Bule"},
						 {"Brown","Black","Grey"},
						};
		

		for (int i=0;i<dogs.length;i++) {
			for (int j=i;j<dogs.length;j++) {
				System.out.println("Anjing saya bernama "+dogs[i][j]+" dan berwarna "+dogs[i][j]);
			}
		}
	}
}