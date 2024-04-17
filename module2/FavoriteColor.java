package module2;
/*Question17
* W.A.J.P to check whether a given string starts with contents of another
*string .Red is favorite color.starts with Red? True orange is also my
*favorite color. starts with Red?False.
*/

public class FavoriteColor {

	public static void main (String[] args){
		String str1="Red is favourite color.";
		String str2="Orange is also my favourite color.";
		String startStr="Red";
		boolean starts1=str1.startsWith(startStr);
		boolean starts2=str2.startsWith(startStr);
		System.out.println(str1+"starts with"+startStr+"?"+starts1);
		System.out.println(str2+"starts with"+startStr+"?"+starts2);
		}
		
}
