package module2;
/*Question32
 * We have to calculate the area of a rectangle, a square and a circle. Create an
 * abstract class 'Shape' with three abstract methods namely 'RectangleArea'
 * taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter
 * each. The parameters of 'RectangleArea' are its length and breadth, that of
 *'SquareArea' is its side and that of 'CircleArea' is its radius. Now create
 * another class 'Area' containing all the three methods 'RectangleArea',
 * 'SquareArea' and 'CircleArea' for printing the area of rectangle, square
 *  and circle respectively. Create an object of class 'Area' and call all
 * the three methods.
*/
abstract class Shapes {
    // Abstract methods for calculating area
    public abstract void rectangleArea(double length, double breadth);
    public abstract void squareArea(double side);
    public abstract void circleArea(double radius);
}

// Class Area implementing the Shape abstract class
class Area extends Shapes {
    // Method to calculate area of a rectangle
    @Override
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate area of a square
    @Override
    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Method to calculate area of a circle
    @Override
    public void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class for testing
public class Question32 {
	 public static void main(String[] args) {
	        // Create an object of Area class
	        Area areaCalculator = new Area();

	        // Calculate and print area of a rectangle
	        areaCalculator.rectangleArea(4, 6);

	        // Calculate and print area of a square
	        areaCalculator.squareArea(5);

	        // Calculate and print area of a circle
	        areaCalculator.circleArea(3);
	    }

}
