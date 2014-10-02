public class Mamalia{
	void KelasMamalia(){
		System.out.println("Ciri umum Mamalia adalah bernapas dengan paru-paru, \nberkembang biak dengan cara beternak");
	}
}

class Paus extends Mamalia{
	String x="Ikan Paus";
	void tampilkanPaus(){
		System.out.println("dan Mamalia yang anda pilih adalah "+x);
		System.out.println("Mamalia ini berada di laut");
		System.out.println("Paus termasuk jenis mamalia terbesar");
	}
}

class Cheetah extends Mamalia{
	String x="Cheetah";
	void tampilkanCheetah(){
		System.out.println("dan Mamalia yang anda pilih adalah "+x);
		System.out.println("Mamalia ini berada di darat");
		System.out.println("Cheetah termasuk jenis mamalia pelari tercepat di darat");
	}
}

class Sapi extends Mamalia{
	String x="Sapi";
	void tampilkanSapi(){
		System.out.println("dan Mamalia yang anda pilih adalah "+x);
		System.out.println("Mamalia ini berada di darat");
		System.out.println("Sapi termasuk jenis mamalia pemamahbiak");
	}
}