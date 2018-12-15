// name the file same as the public class
// javac file name makes the bytecode
// JVM then runs this code 
// data_type variable_name = value;
// Three types of variables in Java, Static, Instance and Local.

public class variables{
	
	// Class variable because of Static word, common to all instances
	// uses public static in front of the variable
	// outside of the class accessed className.varName
	
	public static String clVar = " Class Var"; 
	
	
	// without the public static infront, this is just instances
	// each new instances (objects) have their own copy,
	// unlike the class variable on the top, that is common for all objects
	
	String instanceVar = " Instance Var";
	
	
	 public void myMethod(){
    // local variable
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
	
	
	public static void main (String[] args){
		
		// creating new objects, classType varName = new classType();
		
		variables object1 = new variables();
		variables object2 = new variables();

	System.out.println(object1.clVar);      	// prints Class Var
	System.out.println(object2.clVar);			// prints Class Var
	System.out.println(object1.instanceVar);	// prints Instance Var
	System.out.println(object1.instanceVar);	// prints Instance Var
	
	object1.clVar ="Changed Class";
	Object1.instanceVar = "Changed Instance Var";
	
	// even though object1 changed the class var, both the objects
	// will change the value (Class variable) but only Object1 instance
	// .. var will change but not the object2 (instance variable)
	
	
	System.out.println(object1.clVar);      	// prints Changed Class
	System.out.println(object2.clVar);			// prints Changed Class
	System.out.println(object1.instanceVar);	// prints Changed Instance Var
	System.out.println(object1.instanceVar);	// prints Instance Var
	
	object1.myMethod();							// will print the local variable
												//... inside method
	
	
	

	
		
		
	} //end main
	
}




