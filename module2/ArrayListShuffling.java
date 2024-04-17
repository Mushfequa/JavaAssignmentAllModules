package module2;
/*
 * Question 55
 * • Write a Java program to shuffle elements in an array list. 
 */
import java .util.ArrayList;
import java.util.Collections;
public class ArrayListShuffling {
	public static void main(String[] args){
		//create arrayList
	ArrayList<Integer> arrayList=new ArrayList<>();
	//Adding elements to the ArrayList
	arrayList.add(50);
	arrayList.add(30);
	arrayList.add(80);
	arrayList.add(10);
	arrayList.add(40);
	//print the ArrayList before the shuffling
	System.out.println("ArrayList before shuffling:"+arrayList);

	// shuffle the ArrayList
	Collections.shuffle(arrayList);

	//print the ArrayList after the shuffling
	System.out.println("ArrayList after shuffling:"+arrayList);
	}
}
