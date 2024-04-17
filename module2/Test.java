package module2;

/*Question 26
* Write a program to print the area and perimeter of a triangle having sides of 3, 4
* and 5 units *by creating a class named 'Triangle' without any parameter in 
* its constructor. 
*/
class Triangle {
    // Data members
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle() {
        // Assigning values to sides of the triangle
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    // Method to calculate and print area
    public void printArea() {
        // Using Heron's formula to calculate the area
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area of triangle: " + area);
    }

    // Method to calculate and print perimeter
    public void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}

// Main class for testing
public class Test {
	 public static void main(String[] args) {
	        // Create an object of Triangle class
	        Triangle triangle = new Triangle();
	        // Print area and perimeter of triangle
	        triangle.printArea();
	        triangle.printPerimeter();
	    }
}
