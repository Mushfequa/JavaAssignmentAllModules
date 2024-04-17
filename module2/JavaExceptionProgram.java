package module2;
/*Question37
 * W.A.J.Pto implement the above program(pro.no-27)using nesting of try -catch block.try{
 * try
 * {//code}
 * catch(exception e}
 * {//code}
 * catch(exception e}
 * {//code}
 * 
 */
public class JavaExceptionProgram {
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
