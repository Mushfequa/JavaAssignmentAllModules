package module2;
//W.A.J.P to create a new array list , adds some colors(string)and point out the collection.
import java.util.ArrayList;
public class JavaArray {

	
		 public static void main(String[] args) {
		        // Create a new ArrayList to store colors
		        ArrayList<String> colors = new ArrayList<>();

		        // Add some colors to the ArrayList
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");

		        // Print out the collection
		        System.out.println("Colors in the ArrayList:");
		        for (String color : colors) {
		            System.out.println(color);
		        }
		    
		 }
	}

