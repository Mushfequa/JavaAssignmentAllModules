package module2;
import java.util.Scanner;
/*Question 39
* W.A.J.P to create the validate method that takes integer value as a parameter.
*  If the age is less than 18, then throw an Arithmetic Exception otherwise 
*  print a message welcome to vote.
*O/P- Enter your age: 16
*Exception in thread main java. Lang. Arithmetic Exception: not valid  in java
 */
public class AgeValidator {
	// Method to validate age
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate the age
            validate(age);
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Exception: " + e);
        } finally {
            // Close the scanner
            scanner.close();
        }
    } 
}
