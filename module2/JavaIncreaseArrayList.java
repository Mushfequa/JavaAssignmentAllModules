package module2;
/*
 *  Question 69
 *  Write a Java program to increase the size of an array list
 * 
 */

import java .util.ArrayList;

public class JavaIncreaseArrayList {
	public static void main(String[] args){

		//create an ArrayList.
		ArrayList<String> arrayList=new ArrayList<>();

		// Add elements to the ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Grapes");

		//print the original size of ArrayList
		System.out.println("Original size of ArrayList:"+arrayList.size());

		// Add more elements to the ArrayList
		arrayList.add("Grapes");
		arrayList.add("Grapes");
		System.out.println("New size of ArrayList:"+arrayList.size());
		}
}
