package module2;
/*Question 52
 * Write a Java program to search an element in an array list. 
 */
import java.util.ArrayList;
public class searchArrayElement {
	 public static void main(String[] args) {
	        // Create a new ArrayList
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Grapes");

	        // Element to search
	        String searchElement = "Orange";

	        // Search for the element
	        int index = arrayList.indexOf(searchElement);

	        // Check if the element is found
	        if (index != -1) {
	            System.out.println("Element '" + searchElement + "' found at index: " + index);
	        } else {
	            System.out.println("Element '" + searchElement + "' not found in the ArrayList");
	        }
	    }
}
