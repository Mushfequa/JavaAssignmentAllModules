package module2;
/*Quesion 48
 * Write a Java program to insert an element into the array list at the first position. 
 */
import java .util.ArrayList;
public class InsertFirstPosition {
	public static void main(String[] args){
		ArrayList<String> arrayList=new ArrayList<>();
		//Adding elements to the ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		//Inserting an element at the first position.
		arrayList.add(0,"Mango");

		//Displaying  the updated ArrayList
		System.out.println("Updated ArrayList after inserting at the first position:");
		for(String fruit:arrayList){
		System.out.println(fruit);
		}
		}
}
