// loops in Java, for, enhanced for, while, do while, 


package java_practice;

public class loopsJava {
	
	
	public static void main(String[] args) {
		
		int num = 0;
		
		// for loop
		
		for (int i=0; i < 10; i++) {
			
			num = num+ i;
		}
		
		System.out.println(num);
		
		// while
		
		while(num>0) {
			
			num--;
		}
		
		System.out.println("In while loop "+num);
		
		
		// do while
		do {
			System.out.println("In do while loop" + num);
			num--;
		} while(num >0);
		
		
		// enhanced for
		int arr[]={2,11,45,9};    // array data structure.
	      
		for (int i : arr) {
	     System.out.println(i);
	    	     
	    }
		
		
		// for(;;) is an infinite loop
		
		
	}// end main

}
