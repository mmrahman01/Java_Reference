// loops in Java, for, enhanced for, while, do while, 
// continue skips iteration when true
// break if true breaks the loop

package java_practice;

public class loopsJava {
	
	
	public static void main(String[] args) {
		
		int num = 0;
		
		// for loop
		
		for (int i=0; i < 10; i++) {
						
			if(i == 5) {
				
				continue;  // 5  will not be added
			}
			num = num+ i;
			System.out.println(i);
		}
		
		System.out.println(num);
		
		// while
		
		while(num>0) {
			
			num--;
			if(num < 5) {
				break;        // exits the loop
			}
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
