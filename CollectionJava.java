/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaref;
/*	This is reference for Java collection class (source : https://beginnersbook.com/java-tutorial-for-beginners-with-examples/)
 ArrayList			LinkedList		Vector		HashMap		TreeMap		LinkedHashMap
 												HashSet		TreeSet		LinkedHashSet

 Hashtable in Java					Queue		PriorityQueue			Deque & ArrayDeque

 Comparable Interface				Comparator Interface

*/

// Java collection class would require importing java.util.*


import java.util.*;

public class CollectionJava {
	
	public static void main(String[] args) {
		
		//declarations:
		
	int[] array = new int [10];	//fixed length array with length 10, index 0..9, initialized to 0. 
	ArrayList <Integer> alist = new ArrayList<Integer>();	// Dynamic, LIST interface
	LinkedList<Integer>lList = new LinkedList<Integer>();	// LIST & DEQUEUE interface, doubly linked
	Vector vec1 = new Vector();		//used with threading, defualt increment size 10
	Vector vec2 = new Vector(3);	//initial size 3
	Vector vec3 = new Vector(3,5);	//initial size 3, increment 5
//map		
	HashMap <Integer, String> hmap = new HashMap<Integer, String>();	// not ordered, allows nulll value, <key,value>
	TreeMap<Integer, String> tmap =  new TreeMap<Integer, String>();	// not thread safe, ascending order sort, Red Black tree based
	LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>(); 	//maintain insertion order
//set
	HashSet<String> hset = new HashSet<String>();	// no order, no duplicate, no null, non synchronized,
	TreeSet<String> tset = new TreeSet<String>();	// ascending order, allows null, non synchronized.
	LinkedHashSet<String> lhset = new LinkedHashSet<String>();	// maintain insertion order, no duplicate, 
	    
	Hashtable<String, String> hashtable = 			//  thread safe unlike HashMap, HashMap allows one null key and several Null value unlike HashTable
                new Hashtable<String, String>();		// HashMap ascending order, table none, HashMap enumerator fail fast, table is not
	    
	Queue<String> q = new LinkedList<String>();		//  interface, so create an instance of LinkedList or PriorityQueue
		
	   // PriorityQueue<String> queue = 			// Queue works as a FIFO method, priority works with priority.
	   //         new PriorityQueue<String>(15, new MyComparator());  // ...write MyComparator separately.
	    
	  // Deque is a Queue that can add and remove elements from both sides.
	  // Comparable interface is mainly used to sort the arrays (or lists) of custom objects.
	  // want to have multiple sort choices and we can sort objects based on any choice, this can be done using Comparator interface
	  // 
	}
	

}
