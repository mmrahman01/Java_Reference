/*
 Prime numbers are divisible by 1  and itself only.
 Number < 0 , 0 or 1 is not primbe number, first prime number is 2
 Later on find carmichael number, 
 
 */


package java_practice;

import java.util.*;

public class PrimeNumber {
	
	//------------------- Iterative ---------------------------
	
	// Checks if a number is prime number
	public static boolean primeFinder(int num) {
	
		int n = 2;
		if (num < 2) {
			return false;
		}
		while(n < num){			// while loop use, for loop will do the same with little less code
			if (num % n == 0) {
				return false;
			}
			
			else {
				n++;
			}
		}
		
		return true;
	}
	
	// Returns a list of prime number upto a given number
	// This function calculates the prime number itself, next function will call existing function
	public static ArrayList<Integer> primeGenerate(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean ans = false;
		
		for(int m = 2; m <= num; m++) {
			ans = true;
		for (int i = 2 ; i <=Math.sqrt(num); i++) { // end condition need to be <= else logical error
			if(i == m && m != 1) {
				ans = true;				// if m value starts from 3, then this block will not be necessary
				break;
			}
			
		  if (m % i == 0) {
			  	ans = false;
				break;
			}
		}
			if(ans) {
				list.add(m);
				ans = false;
			}
		}
		
		return list;
	}
	
	
	//This function uses the existing function to populate the list of prime numbers
	public static ArrayList<Integer> primeFunction(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i <= num; i++) {
			if(primeFinder(i)) {
				list.add(i);
			}
		}
		
		return list;
	}
	
//--------------- Recursive ------------------------------------------
	// find isPrime and listPrime recursively
	
public static boolean isPrime(int num, int n) { // in recursive solution the iterator need to be sent 
	
	if(num < 2 || num % n == 0 && num !=2) {
		return false;	
	}
	
	if(n >= Math.sqrt(num)) {
		return true;
	}
	
return isPrime(num, n+1);
}

// list recursively


public static ArrayList<Integer> primeList(ArrayList<Integer>list,int num, int n){
	
	if (num < 2 || n >= num) {
		if(isPrime(n,2)) {
			list.add(n);
		}
	return list;
	}
	
	if(isPrime(n,2)) {
		list.add(n);
	}
	return (primeList (list, num, n +1));
			
}
	
// --------------- Driver function -------------------------	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Find a prime number: enter 'a' || Find up to a prime number : enter 'b'---> ");
		char ans = scan.next().charAt(0);
		System.out.println(" ");
		
		if (ans == 'a') { // pass an int get a boolean
			System.out.print("Enter a number to find out if it is a prime number:  ");
			int prime = scan.nextInt();
			boolean result = primeFinder(prime);
			System.out.print("Result: "+ result);
			System.out.println(" ");
		}
		
		else if (ans == 'b') { // pass in int get a array list of type int
			System.out.print("Enter a number to generate prime numbers upto that number:  ");
			int primegen = scan.nextInt();
			System.out.println("Num is prime: " + isPrime(primegen,2));
			ArrayList <Integer>list  = primeGenerate(primegen);
			System.out.print("The prime numbers are: (iteration): " + list);
			System.out.println(" ");
			
			list =primeFunction(primegen); 
			System.out.print("The prime numbers are (function):   " + list);
			System.out.println(" ");
			
			ArrayList<Integer>list1 = new ArrayList<Integer>();
			list1 =primeList(list1,primegen,2); 
			System.out.print("The prime numbers are (recursion):  " + list);
			System.out.println(" ");
			//primeList(primegen);
			System.out.println(" ");
		}
		
		else {
			System.out.println("Wrong choice. ");
		}
		
		scan.close();
		
	} // end main

}
