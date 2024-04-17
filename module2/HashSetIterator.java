package module2;
/*
 *  Question 57
 * Write a Java program to iterate through all elements in a hash list. 
 */
import java .util.ArrayList;
import java.util.Iterator ;
public class HashSetIterator {
	public static void main(String[]args){
		ArrayList<String> hashList=new ArrayList<>();
		hashList.add("Apple");
		hashList.add("Banana");
		hashList.add("Orange");
		hashList.add("Grapes");
		hashList.add("Mango");
		Iterator<String>iterator=hashList.iterator();
		while(iterator.hasNext()){
		String element=iterator.next();
		System.out.println(element);
		}

}
}