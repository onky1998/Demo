package Methods;

public class Demo {// Class Body
	
	public static void main(String []args) { // Main method body
		// Starting point of the program
		
		// Static Regular method from same class
		
		System.out.println("Main method Started");
		
		//1. Direct calling from method name
		// Syntax - Methodname();
		
		M1();
		M2();
		
		//2. Calling by Classname
		// SYntax - Classname.methodname();
		
		Demo.M1();
		Demo.M2();
		
		
		System.out.println("Main method Started");
		
		
		
		
		
	}

	public static void M1() {
		
		System.out.println("Static method is running from same class : M1");
		
	}
	
	public static void M2() {
		
		System.out.println("Static method is running from same class : M2");
		
	}
	
}
