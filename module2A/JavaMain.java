package module2A;

/*Question 33
 * Create a class named 'Shape' with a method to print "This is this is shape".
 *Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape
 * class, both having a method to print "This is rectangular shape" and "This is 
 *circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having
 * a method to print "Square is a rectangle". Now call the method of 'Shape' and
 *  'Rectangle' class by the object of 'Square' class.
 */
//Shape class
class Shape {
 // Method to print "This is a shape"
 public void printShape() {
     System.out.println("This is a shape");
 }
}

//Rectangle class inheriting from Shape
class Rectangle extends Shape {
 // Method to print "This is a rectangular shape"
 public void printRectangle() {
     System.out.println("This is a rectangular shape");
 }
}

//Circle class inheriting from Shape
class Circle extends Shape {
 // Method to print "This is a circular shape"
 public void printCircle() {
     System.out.println("This is a circular shape");
 }
}

//Square class inheriting from Rectangle
class Square extends Rectangle {
 // Method to print "Square is a rectangle"
 public void printSquare() {
     System.out.println("Square is a rectangle");
 }
}

//Main class for testing

public class JavaMain {
	public static void main(String[] args) {
        // Create an object of Square class
        Square square = new Square();

        // Call method of Shape class by the object of Square class
        square.printShape();

        // Call method of Rectangle class by the object of Square class
        square.printRectangle();
    }
}
