package module2;
/*
 * Question 62
 * Write a Java program to extract a portion of an array list
 * 
*/
import java .util.ArrayList;
import java.util.List;

public class JavaArrayListPortionExtract {
	public static void main(String[] args){
		  // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Print the ArrayList
        System.out.println("Original ArrayList:");
        System.out.println(arrayList);

        // Extract a portion of the ArrayList (from index 1 to 3)
        List<String> subList = arrayList.subList(1, 4);

        // Print the extracted portion
        System.out.println("\nExtracted portion of the ArrayList:");
        System.out.println(subList);
    }
}
