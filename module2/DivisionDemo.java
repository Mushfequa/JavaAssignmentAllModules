package module2;
/*Question 38
 *W.A.J. P to demonstrate try catch block, take two numbers from the user by
 *Command line argument and perform the division operation and handle
 *Arithmetic O/PException in thread main java. Lang. Arithmetic Exception:/ by
 * zero
 * 
 * 
 */

public class DivisionDemo {
	public static void main(String[] args) {
        try {
            // Checking if two arguments are provided
            if (args.length != 2) {
                System.out.println("Please provide two numbers as command line arguments.");
                return;
            }
            
            // Parsing the command line arguments to integers
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            
            // Performing division
            int result = dividend / divisor;
            
            // Printing the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("Error: Please provide valid integers as command line arguments.");
        }
    }
}
