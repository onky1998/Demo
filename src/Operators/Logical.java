package Operators;

public class Logical {
	
	public static void main(String []args) {
		
		boolean a = true;
		boolean b = true;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		
		System.out.println("___________________________");
		
		boolean a1 = true;
		boolean b1 = false;
		
		System.out.println(a1&&b1);
		System.out.println(a1||b1);
		
		System.out.println("___________________________");
		
		boolean a2 = false;
		boolean b2 = true;
		
		System.out.println(a2&&b2);
		System.out.println(a2||b2);
		
		System.out.println("___________________________");
		
		boolean a3 = false;
		boolean b3 = false;
		
		System.out.println(a3&&b3);
		System.out.println(a3||b3);
		
		System.out.println("___________________________");
	}

}
