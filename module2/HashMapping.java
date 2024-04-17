package module2;
/*
 *  Question 68
 * Write a Java program to check whether a map contains key-value mappings 
 * (empty) or not. 
 * 
 */
import java.util.HashMap;
import java.util.Map;
public class HashMapping {
	 public static void main(String[] args) {
	        // Create a HashMap
	        Map<String, String> map = new HashMap<>();

	        // Add some key-value mappings to the map
	        map.put("key1", "value1");
	        map.put("key2", "value2");

	        // Check if the map is empty
	        if (map.isEmpty()) {
	            System.out.println("Map is empty");
	        } else {
	            System.out.println("Map is not empty");
	        }
	    }
}
