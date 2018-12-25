package javaref;

/* this is an example of constructor chaining, multiple constructors are 
initialized by calling one constructor. Example for use designing an elevator program
*/
public class ConstructorChaining {
    
    String empName;
    int empSalary;
    String empaddress;
  
// four constructors initilized using a single call, use this keyword    
    ConstructorChaining(){
        this("Alex");   // calling the next constructor, and then next etc.
    }
    ConstructorChaining(String name){
        this(name, 60000);  // getting parameter from the previous, and so on 
    }
    ConstructorChaining(String name, int num){
        this(name,num,"123 Main Street");
    }
    ConstructorChaining(String name, int salary, String address){
        empName = name;
        empSalary = salary;
        empaddress = address;             
    }
    
    public void display(){
        System.out.println("Employee Name:    "+ empName);
        System.out.println("Employee address: "+ empaddress);
        System.out.println("Employee Salary:  $"+ empSalary);        
    }
    
    public static void main(String[] args){
        ConstructorChaining obj1 = new ConstructorChaining();
        obj1.display();     // displays the instance method, nothing being passed
    }
}
