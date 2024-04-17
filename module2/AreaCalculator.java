package module2;
/*QUESTION22
*Create a class to print the area of a square and a rectangle .The class has two methods with the same
*name but different number of parameters.The method for printing area of rectangle has two perameter 
*which are length and breadth respectively while the other method for printing area of square has one 
*parameter which is side of square.
*/

public class AreaCalculator {
	
	    // Method to calculate area of a square
	    public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of square: " + area);
	    }

	    // Method to calculate area of a rectangle
	    public void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of rectangle: " + area);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Create an object of AreaCalculator class
	        AreaCalculator calculator = new AreaCalculator();

	        // Calculate and print area of a square
	        calculator.calculateArea(5);

	        // Calculate and print area of a rectangle
	        calculator.calculateArea(4, 6);
	    }
	}

