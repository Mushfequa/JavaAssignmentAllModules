package module2;
/*
 * Question 60
 * Write a Java program to count the number of key-value (size) mappings in a 
 * map. 
 */
import java .util.HashMap;
import java .util.Map;

public class MapSizeExample {
	public static void main(String[] args){

		//create a Map
		Map <String,Integer>map= new HashMap<>();

		//Add key-value mapping to the map
		map.put("One",1);
		map.put("Two",2);
		map.put("Three",3);
		map.put("Four",4);
		// count the number of key-value mappings(size) in the map
		int size=map.size();
		  //print the size of the map 
		 System.out.println("Number of key-value mappings in the map  :"+size);
		 
		 
		}

}
