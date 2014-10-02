public class ManipulasiString {
    public static void main(String[] args) {
        //deklarasi String
        String str1 = "DODO";
		String str2 = " ISKANDAR";
		System.out.println("String Awal : "+str1+" dan "+str2);
		
		//menggunakan concat
		String strGabung = str1.concat(str2);
		System.out.println("Concat : "+strGabung);
		
		//menggunakan replace
		String strReplace = strGabung.replace('O', 'E');
		System.out.println("replace 'O', 'E' : "+strReplace);
		
        //menggunakan toLowrCase
		String strtoLowerCase = strReplace.toLowerCase();
        System.out.println("toLowerCase : "+strtoLowerCase); 
    }
}