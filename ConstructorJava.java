package javaref;
/*  This module discusses Java Constructor
1. Initializes an Object, Same name as the class and no return type
2. Constructors CANNOT be abstract, final, static and synchronised, but can be public, private, default etc.
3. No constructor in the class means object uses super constructor
4. Three types of constructor : default, no arg, parameterized
5. Implementing any constructor means, no constuctor from Java.
6. When java sees -> new TYPE(), this is where it looks to create the object.
7. If any constructor have been written, then default constructor has to be implemented by the programmer
8. super() -> Whenever a child class constructor gets invoked it implicitly invokes the constructor of parent class. 
                class extend as an example
9. Allows constructor overloading. but not overriding, no inheritance. interface does not have but abstract class do have constructor 
10. Constructor chaining => provides multiple constructor to user using single initialization. (example separate from here)
*/

public class ConstructorJava {
    // if any constructor is implemented then java will not implement the default constructor.
    
    String name;
    int id;
    
// default constructor, body is emptly
   // ConstructorJava(){} //.. java will insert it into the .class file, in case no constructor.
  
// no-arg constructor, just like default, but body may have any code.
    ConstructorJava(){
       System.out.println("This is no-arg constructor");
    }
    
// parameterized constructor
    ConstructorJava(String name, int num){
        this.name = name; // this refers to the current object, pointing to the instance variable
        this.id = num;
        System.out.println(name+" "+id);
    }
    
    public static void main (String[]args){
        //object creation
        ConstructorJava obj1 = new ConstructorJava(); // since this is coded, the print statement will execute
        System.out.println("I am main");
        ConstructorJava obj2;
        obj2 = new ConstructorJava("Alex", 101);    // parameterized constructor
    }
}