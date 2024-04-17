package module2;
/*Question16
* W.A.J.P to check 	whether a given strings and with the contents of
*another string Java Exercises ends with "se" ? false "Java Exercise"
*ends with "se" ?True.
*/
public class JavaExercise {

public static void main (String[] args){
String str1="Java Exercises";
String str2="Java Exercise";
String e="se";
boolean ends1=str1.endsWith(e);
boolean ends2=str2.endsWith(e);
System.out.println("'"+str1+"'ends with"+"'"+e+"'?"+ends1);
System.out.println("'"+str2+"'ends with"+"'"+e+"'?"+ends2);
}

}
