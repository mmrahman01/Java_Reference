package javaref;
/*
Copy constructor example from beginnersbook.java
*/

public class CopyConstructor {
    String var;
    public CopyConstructor(String v) {  //parameterized constructor; note Java will not ..
        var = v;                       // .. have default constructor any more
    }
    
    public CopyConstructor(CopyConstructor cons){
        var = cons.var;                 // cons passed and this constructor copies..
    }                                   // ... into the var for current constructor
    
    public static void main (String[] args){
                                        // notice how String has to be passed here
        CopyConstructor obj1 = new CopyConstructor("Test");
        CopyConstructor obj2 = new CopyConstructor(obj1);  // obj1 passed to copy 
        System.out.println("This is obj1: "+obj1.var);      // prints Test
        System.out.println("This is obj1: "+obj2.var);      // should print Test
    }
    
}
