package module2;

/*
 * Question25
 * create class named Rectangle with two data members Length and breadth and two methods to print
 * the area and parameter of the Rectangle respectively.its constructor having parameters for 
 * length and breadth is used to initialize the length and breadth of the Rectangle.let class
 * square inherit the rectangle class with its constructor having a parameter for its side (suppose s)
 * calling the constructor  of its parent class as super(s,s)print the area and parameters of a Rectangle
 * and Square.
 * 
 * 
 */
class Rectangle{
	private  int length;
	private int breadth;
	 public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void printArea() {
		
			int area = length * breadth;
	        System.out.println("Area of rectangle: " + area);	
	}
	public void perimeter() {
		 int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of rectangle: " + perimeter);
	}
}
	class Square extends  Rectangle{
		
		public Square(int side){
			 super(side,side);
				 
			 }}
		 

public class Shape {
	public static void main(String[] args) {
		  // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle(4, 6);
        // Print area and perimeter of rectangle
        rectangle.printArea();
        rectangle.perimeter();

        // Create an object of Square class
        Square square = new Square(5);
        // Print area and perimeter of square
        square.printArea();
        square.perimeter();
	

		 
	}	 

}
