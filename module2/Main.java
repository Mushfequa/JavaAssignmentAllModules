package module2;


/*
 * Question23
 * Create a class with a method that prints "This is a parent class" and its 
 * subclass with another method that prints "This is child class". Now, create
 * an object for each of the class and call 1 - method of parent class by 
 * object of parent class 2 - method of child class by object of child class 
 * 3 - method of parent class by object of child class 
 * 
 */
//Parent class
class Parent {
 // Method in parent class
 public void printParentMethod() {
     System.out.println("This is a parent class");
 }
}

//Subclass inheriting from Parent class
class Child extends Parent {
 // Method in child class
 public void printChildMethod() {
     System.out.println("This is a child class");
 }
}

//Main class for testing

public class Main {

	public static void main(String[] args) {
        // Creating an object for parent class
        Parent parentObj = new Parent();
        // Calling method of parent class by object of parent class
        parentObj.printParentMethod();
        
        // Creating an object for child class
        Child childObj = new Child();
        // Calling method of child class by object of child class
        childObj.printChildMethod();
        
        // Calling method of parent class by object of child class
        childObj.printParentMethod();
    }

}
