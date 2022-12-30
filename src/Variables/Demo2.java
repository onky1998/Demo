package Variables;

public class Demo2 {
	
	public static void main (String []args) {
		
		System.out.println("Main method started");
		// Static regular method calling from different class
		
		//1. Direct calling by method name
		//M1();
		
		//2. calling by class name
		
		Differentclass.M1();
		Differentclass.M2();
		
		System.out.println("Main method ended");
		
	}
	
	
	

}
