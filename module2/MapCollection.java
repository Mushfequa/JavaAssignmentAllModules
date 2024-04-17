package module2;
/*
 * Question 73
 * Write a Java program to get a collection view of the values contained in this
 *  map
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
public class MapCollection {
	public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value mappings to the map
        map.put("key1", "Red");
        map.put("key2", "White");
        map.put("key3", "Black");

        // Get a collection view of the values contained in the map
        Collection<String> values = map.values();

        // Print the collection view of the values
        System.out.println("Collection view of values in the map:");
        for (String value : values) {
            System.out.println(value);
        }
	}
}
