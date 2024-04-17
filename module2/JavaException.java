package module2;
/*Question34
 * W.A.J.P to demonstrate try catch block
 * 
 */
public class JavaException {
	public static void main (String[] args) {
	try {
		//ArithmeticException
				int number=10;
				System.out.println("10/0");
			}catch(ArithmeticException e) {
				System.out.println("e.getMessage");
			
		
	}finally {
		System.out.println("finally block executed.");
	}
}

}
