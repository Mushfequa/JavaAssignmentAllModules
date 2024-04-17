package module2;
/*
 *  Question 65
 *  Write a Java program to join two array lists
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListJoin {
	public static void main(String[] args){
		//create two arrayList
		ArrayList<String> list1=new ArrayList<>();
		//Adding elements to the ArrayList
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");

		ArrayList<String> list2=new ArrayList<>();
		list2.add("Grapes");
		list2.add("Mango");
		list2.add("Cherry");
		//Joining two ArrayList
		List<String> joinedList= new ArrayList<>(list1);
		 joinedList.addAll(list2);
		System.out.println("Joined ArrayList:");
		for(String item:joinedList){
			System.out.println(item);
		}

		}
}
