package module2;
/*Question 49
* Write a Java program to retrieve an element (at a specified index) from a given array
*list.
*/
import java.util.ArrayList;

public class RetrievesArrayList {
	public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Specified index to retrieve element from
        int index = 2;

        // Check if the specified index is within the bounds of the ArrayList
        if (index >= 0 && index < arrayList.size()) {
            // Retrieve the element at the specified index
            String element = arrayList.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
