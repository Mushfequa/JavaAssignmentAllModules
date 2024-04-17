package module2;
/*Question15
* W.A.J.P to compare a given string to specified the character sequence
*comparing topsint.com and topsint.com:true comparing Topsint.com and    
*topsint.com:false.
*/
public class CompareString {
	public static void main(String[]args){
		String str1 ="topsint.com and topsint.com";
		String str2 = "topsint.com and Topsint.com";
		boolean Str1=true;
		boolean Str2=false;
		CharSequence cs="topsint.com and topsint.com";
		System.out.println("comparing"+str1+"and"+cs+":"+str1.contentEquals(cs));
		System.out.println("comparing"+str2+"and"+cs+":"+str2.contentEquals(cs));

		}

		
}
