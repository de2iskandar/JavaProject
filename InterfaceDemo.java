interface MyInterface{
	void iMethod();
	void jMethod();
}

class MyClass1 implements MyInterface {
	public void iMethod(){
		System.out.println("Method interface yang pertama pada MyClass1");
	}
	void myMethod(){
		System.out.println("Method lain punya MyClass1");
	}

	public void jMethod(){
		System.out.println("Method interface yang kedua pada MyClass1");
	}
}

class MyClass2 implements MyInterface{
	public void iMethod(){
		System.out.println("Method interface yang pertama pada MyClass2");
	}
	public void jMethod(){
		System.out.println("Method interface yang kedua pada MyClass2");
	}
}

class MyClass3 implements YourInterface{
	public void aMethod(){
		System.out.println("Method interface dari interface yg lain");
	}
}

class InterfaceDemo{
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		MyClass4 mc4 = new MyClass4();
		mc1.iMethod();
		mc1.jMethod();
		mc1.myMethod();
		mc2.iMethod();
		mc2.jMethod();
		mc3.aMethod();
		mc4.aMethod();
		mc4.iMethod();
		mc4.jMethod();
	}
}