package module2;
/*Question 36
 * W.A.J.P to demonstrate multiple catch blocks(one is handle divide by zero exception and another one is to 
 * handle  ArrayIndexOutOfBoundsException) int a[]=new int [5]; a[5]=30/0;
 * 
 * 
 * 
 */


public class JavaExceptionPractical1 {
	public static void main(String [] args) {
		try {
			
		
		int[] a=new int [5];
		a[5]=30/0;
		
	}catch(ArithmeticException e) {
		System.out.println("ArithmeticException occured:"+e.getMessage());
		
	}catch(ArrayIndexOutOfBoundsException e) {

		System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
	}

}
}
