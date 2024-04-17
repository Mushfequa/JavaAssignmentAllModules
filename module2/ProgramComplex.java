package module2;
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to display complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ProgramComplex {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the real part of the first complex number:");
	        double real1 = scanner.nextDouble();
	        System.out.println("Enter the imaginary part of the first complex number:");
	        double imaginary1 = scanner.nextDouble();
	        Complex complex1 = new Complex(real1, imaginary1);

	        System.out.println("Enter the real part of the second complex number:");
	        double real2 = scanner.nextDouble();
	        System.out.println("Enter the imaginary part of the second complex number:");
	        double imaginary2 = scanner.nextDouble();
	        Complex complex2 = new Complex(real2, imaginary2);

	        // Perform operations
	        System.out.println("Sum of the two complex numbers:");
	        Complex sum = complex1.add(complex2);
	        sum.display();

	        System.out.println("Difference of the two complex numbers:");
	        Complex difference = complex1.subtract(complex2);
	        difference.display();

	        System.out.println("Product of the two complex numbers:");
	        Complex product = complex1.multiply(complex2);
	        product.display();
	    }

}
