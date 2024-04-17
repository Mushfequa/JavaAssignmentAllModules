package module2;
/*
 * Question 53
 *  Write a Java program to sort a given array list. 
 */
import java .util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String[] args){
		//create arrayList
	ArrayList<Integer> arrayList=new ArrayList<>();
	//Adding elements to the ArrayList
	arrayList.add(50);
	arrayList.add(30);
	arrayList.add(80);
	arrayList.add(10);
	arrayList.add(40);
	//print the ArrayList before the sorting
	System.out.println("ArrayList before sorting:"+arrayList);

	// sort the ArrayList
	Collections.sort(arrayList);

	//print the ArrayList after the sorting
	System.out.println("ArrayList after sorting:"+arrayList);
	}
}
