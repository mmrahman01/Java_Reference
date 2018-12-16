// Java have built in LinkedList just like ArrayList,
// this program implement linkedlist from ground up

/*
https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
(The above resources was used to understand this concept)

Linked List has a field for data and a next field that points to the next node
so each node has data and next, more details in the program

 Operatiions:   Insertion, Delete by position, Delete by key, Display, Search, Reverse 


*/

package java_practice;

import java.io.*;

// linked list is being implemented with a class inside a class. In C/C++ pointer is used,
// Java does not have explicit pointer , so inner class and outer class is used.



public class LinkedListScratch {

	Node head;		// Node class is being declared as the inner class
					// head is going to point to the head of the list
	
	static class Node{		// inner class Node is static so that main() can access it
		
		int data;	// this link list will only accept int data, anytype in the future
		Node next;	// next here is of type Node, ... need to find the explanation
		
		Node (int d){	// this is constructor of class Node, initialized with d passed from calling method
			
			data = d;
			next = null;
		}
		
	} // so Node class has two fields data and next. Next few methods perform typical linked list operation (line 12 here)
	
	
	// insertion method, static so main can call it, also notice how class was used here
	
	public static LinkedListScratch insert(LinkedListScratch list, int data) { // notice return type
		
		Node newNode = new Node(data); // static type node is passed data, consturctor uses this data to create a new node (line 36 here)
		newNode.next = null; 		//this field should already be null, not sure why my source did (line 5,6) did it, put comment later
		
		if(list.head == null) {		// if head is null, then list is empty and the head gets this newNode
			list.head = newNode;	// list is an object of LinkedListScratch and head is its instance variable
		}
		else {						// if list.head is not null then, traverse to the end of list to insert
			Node temp = list.head;	// declare temp of type Node, points to the head then traverse
			while (temp.next != null) {
				temp = temp.next; 
			} // temp now pointing at the last Node
			
			temp.next = newNode;
		}
		return list;  // this returns the list by head ???
	} // end insert
	
	
	
	
	
	
	// ----------------  print the linked list -----------------------
	
	public static void printList(LinkedListScratch list) {
		
		Node temp = list.head;  // temp Node points to the head of the passed list, if temp is not used, then data gets corrupted
		
		System.out.print(" The linked list is:");
		while(temp != null) {
			System.out.print(" ");
			System.out.print(temp.data);
			
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	
	
	public static void main(String[] args) {  // main is also known as a driver function
		
		LinkedListScratch list = new LinkedListScratch();  // list is an object of the class? empty list?
		
		list = insert(list, 10);		// insert is static so list.insert not used, also notice how to call 
		list = insert(list, 20);		// list is getting the return value of insert
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		printList(list);		// print is static void, so calling is different then insert
		
	} // end main

} // end of LinkedListScratch





















