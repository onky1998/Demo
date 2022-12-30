package Variables;

public class Demo1 {
	
	public static void staticmethod1() {
		
		System.out.println("Static method calling from same class : staticmethod1");
	}

	public static void staticmethod2() {
		
		System.out.println("Static method calling from same class : staticmethod2");
		
	}
	
	public static void main(String []args) {
		
		System.out.println("Main method started");
		
		// Static Regular method calling from same class
		
		// 1. Direct calling by method name
		
		//Syntax : methodname();
		
		staticmethod1();
		staticmethod2();
		
		//2. calling by class name
		// Syntax : classname.methodname();
		
		Demo1.staticmethod1();
		Demo1.staticmethod2();
		
		
		System.out.println("Main method ended");
		
		
	}
}
