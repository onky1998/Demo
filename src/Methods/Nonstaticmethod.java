package Methods;

public class Nonstaticmethod {

	public void M1() {
		
		System.out.println("Non-Static regular method calling from same class : M1");
		
	}
	
	public void M2() {
		
		System.out.println("Non-Static regular method calling from same class : M2");
		
	}
	
	public static void main(String []args) {
		
		System.out.println("Main method started");
		
		// Non-Static regular method calling from same class
		
		
		// object creation
		// Syntax : calssname referencevariablename = new classname();

		Nonstaticmethod abc = new Nonstaticmethod();
		
		// Syntax : referencevariablename.methodname();
		
		abc.M1();
		abc.M2();
		
		System.out.println("Main method ended");
		
	}
}
