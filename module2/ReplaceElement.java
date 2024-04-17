package module2;
/*
 *  Question 70
 * Write a Java program to replace the second element of an Array List with the
 * specified element. 
 * 
 */
import java .util.ArrayList;

public class ReplaceElement {
	public static void main(String[] args){

		//create an ArrayList.
		ArrayList<String> arrayList=new ArrayList<>();

		// Add elements to the ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Grapes");

		//print the original size of ArrayList
		System.out.println("Original size of ArrayList:"+arrayList);

		String replacement="new mango";

		if(arrayList.size()>=2){
		arrayList.set(1,replacement);
		System.out.println("ArrayList after replacement:"+arrayList);

		}else{
		System.out.println("ArrayList does not have enough elements to replace the second element.");
		}
		}
}
