package module2;
/*Question 35
 * 
 * W.A.J.P TO demonstrate try catch block take two numbers from the user by command line argument and perform
 * the division operation and handle ArethmeticException .O/P- Enter two numbers: 10 0 
 * Exception in thread main java.lang.ArithmeticException:/ by zero
 * 
 * 
 */
import java.util.Scanner;

public class JavaArithmeticException {
	public static void main (String []args) {
		
			int number1;
			int number2;
			try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number1");
			Integer num1=sc. nextInt();
			System.out.println("Enter number1");
			Integer num2=sc. nextInt();
			
				System.out.println();
			}catch(ArithmeticException e) {
				System.out.println("Error:Division by zero is not allowed");
			}catch(Exception e) {
				System.out.println("Error:please enter valid number");
		}
	}
	}
