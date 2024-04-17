package module2;
/*Question 51
 * Write a Java program to remove the third element from an array list. 
 */
import java .util.ArrayList;

public class RemoveArrayElement {
	public static void main(String[] args){
		ArrayList<String> arrayList=new ArrayList<>();
		//Adding elements to the ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Mango");
		System.out.println("Original ArrayList:"+arrayList);
		if(arrayList.size()>=3){
		arrayList.remove(2);
		System.out.println("Third element removed successfully.");
		}else{
		System.out.println(" ArrayList does not have third element to remove.");

		}
		System.out.println("update ArrayList:"+arrayList);
		}
}
