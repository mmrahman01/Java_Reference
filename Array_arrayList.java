// Array and Array list in Java

// Array if fixed size, 0 based index --- int arr[]= new arr[5];
// ArrayList is dynamic.  ----- ArrayList<Integer> alist = new ArrayList<Integer>();

// Operations: Declare, Traverse, Insert, Delete, Search, Update
// look at big O implications later


package java_practice;

import java.util.*;

public class Array_arrayList {

	public static void main(String[] args) {
	
	// Array
		
	int array1[] = new int[10];   // declare array
	int array2[] = {1,2,3,4,5};  // array size 5, array index 0-4
	
	System.out.print("Array 1: ");
	
	for (int i =0; i < 10; i++) {
		
		System.out.print(" " + array1[i]); // prints all 0, that how java initialize it.
	}
	
	System.out.print("\n");
	
	System.out.print("Array 2: ");
	
	for(int i: array2) {
		
		System.out.print(" " + i ); // only for iteration over array
	}
	
	System.out.println(" ");
		
	// Array insertion
	for(int i =0; i < array1.length; i++) {
		
		array1[i]= i;
	}
	
	System.out.print("Array 1: ");
	for(int i: array1) {
		System.out.print(" " +i);;
	}
	
	// deletion
	
	System.out.println(" ");
	array1[2]= 5;
	System.out.println("Array1 at 2:  " + array1[2]);
	
	// search
	
	for(int i =0; i < array1.length; i++) {
		
		if(array1[i] == 5) {
			System.out.println("Index at search :" + i);
		}
	}
	
	
	//----------------- ArrayList-------------------------
/*	
	 declaration, add, update, search, delete, traverse
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 add( Object o): obj.add("hello");  				add(int index, Object o):obj.add(2, "bye");
	 remove(Object o):obj.remove("Hello"); 				remove(int index): obj.remove(3);
	 set(int index, Object o): obj.set(2, "Tom");		int indexOf(Object o): int pos = obj.indexOf("Tom");
	 Object get(int index): String str= obj.get(2);		int size(): int numberofitems = obj.size();
	 boolean contains(Object o): obj.contains("Steve");	clear():obj.clear();
	
	 
	 */
	ArrayList <Integer> alist = new ArrayList <Integer>();
	
	System.out.println("Array List : "+ alist);  // prints []
	
	// initialize with Arrays.aslist
	
	ArrayList <Integer> blist = new ArrayList <Integer>(
			Arrays.asList(1,2,3,4,5) );
		System.out.println("Array blist : " + blist);	// prints [1,2,3,4,5]
		
	@SuppressWarnings("serial")
	ArrayList<String> aString = new ArrayList<String>() {
		{
			add("Tom"); 
			add("Dick"); 			
			add("Jerry");
		}
	};
	
	System.out.println("a String : "+ aString); // prints [Tom, Dick, Jerry]
	
	// add
	alist.add(10);
	alist.add(20);
	alist.add(30);
	alist.add(40);
	alist.add(50);
	
	System.out.println("alist : " + alist); // prints [1, 2]
	
	
	// iterate ArrayList using for loop
	
	System.out.print("For loop on list: ");
	for(int i = 0; i < alist.size(); i++) {
		System.out.print(" ");
		System.out.print(alist.get(i));
	}
	
	System.out.println(" ");
	// iterate ArrayList using enhanced for loop
	
	System.out.print("EnhancedFor loop on list: ");
	
	for(int i: alist) {
		System.out.print(" ");
		System.out.print(i);
	}
	System.out.println(" ");
	
	// iterate ArrayList using iterator
	
	System.out.print("Using iterator : ");
	Iterator<Integer> iter = alist.iterator();
	
    while (iter.hasNext()) {
    	System.out.print(" ");
        System.out.print(iter.next());
     }
    
	System.out.println(" ");
	
	// using enumeration
	
	Enumeration<Integer> e = Collections.enumeration(alist);
	
	// Enumerate through the ArrayList elements
    System.out.print("ArrayList elements: ");
   
    while(e.hasMoreElements()) {
    	System.out.print(" ");
    	System.out.print(e.nextElement());
    }
    System.out.println(" ");
	
	} // end main
	
}

















