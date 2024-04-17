package module2;
/*
 *  Question 64
 * Write a Java program of swap two elements in an array list. 
 * 
 */
import java .util.ArrayList;
import java.util.Collections;
public class ArrayListSwap {
	public static void main(String[] args){
		//create arrayList
	ArrayList<String> arrayList=new ArrayList<>();
	//Adding elements to the ArrayList
	arrayList.add("Apple");
	arrayList.add("Banana");
	arrayList.add("Orange");
	arrayList.add("Grapes");
	//print the ArrayList before the swapping
	System.out.println("ArrayList before swapping ");
	System.out.println(arrayList);
	//swap elements at indexes 1 and 3
	Collections.swap(arrayList,1,3);
	 //print the ArrayList after the swapping
	System.out.println("\nArrayList after swapping:");
	System.out.println(arrayList);
	}
}
