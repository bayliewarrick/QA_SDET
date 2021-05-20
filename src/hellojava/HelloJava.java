package hellojava;

public class HelloJava {
	
	public static void doHello() {
		System.out.println("Hello, methods!");
	}
	public static void print(Object printItem) {
			System.out.println(printItem);
	}
	
	public static int value;
	
	public static void main(String[] args) {

		doHello();
		String aString = "Hey!";
		System.out.println(aString);
		value = 1000;
		float f = 2147483647;
		print(f);
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.print("Hello World!");
		System.out.print("Hello World!");
		
	}

}
