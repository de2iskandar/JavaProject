public class break1 {
	public static void main(String[] args) {
		String names[]={"AA","II","UU","EE"};
		String searchName="OO";
		boolean foundName=false;

	for (int i=0;i<names.length;i++) {
		if (names[i].equals(searchName)) {
			foundName=true;
			break;
		}
	}
	if (foundName) {
		System.out.println(searchName+" ditemukan!");
	}else {
		System.out.println(searchName+" tidak ditemukan!");
	}
	}
}