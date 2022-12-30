package Loops;

public class ForLoop {

	public static void main(String []args) {
		
		// For loop
		
		// WAP to print 1 to 10 using for loop
		
		for(int a = 1;a<=10;a++) {
			
			System.out.println(a);
		}
		
		// WAP to print reverse numbers from 10 to 1 using for loop
		
		for (int b = 10;b>=1;b--) {
			
			System.out.print(" "+b);
			
		}
		
		//WAP to print addition of 1 to 5 numbers using for loop
		
		int sum = 0;
		for(int c = 1; c<=5;c++ ) {
			sum =sum+c;
			
		}
		
		System.out.println(" Addition of 5 numbers : "+sum);
	}
}
