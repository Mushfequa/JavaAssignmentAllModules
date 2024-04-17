package module2;

/*Question 47
 *  Write a Java program to iterate through all elements in an array list.
 */
import java .util.ArrayList;
public class IterateArrayLlist {
	public static void main(String [] args){
		//creating an ArrayList
		ArrayList<String> arrayList=new ArrayList<>();

		//Adding elements to the ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Mango");
		arrayList.add("Graps");
		//Itering through the ArrayList using a for loop
		System.out.println("Itering through the ArrayList using a for loop:");
		for(int i=0;i<arrayList.size();i++){
		System.out.println(arrayList.get(i));
		}
		//Itering through the ArrayList using an enhanced for loop
		System.out.println("Itering through the ArrayList using an enhanced for loop:");
		for(String fruit:arrayList){
		System.out.println(fruit);
		}
		}
}
