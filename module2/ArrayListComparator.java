package module2;
/*
 * Question 63
 * Write a Java program to compare two array lists
 * 
 */
import java .util.ArrayList;
import java.util.Arrays;
public class ArrayListComparator {
	public static void main(String[] args){
		//create two arrayList
	ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,6,3,4,5));
	 //compare the ArrayList
	boolean isEqual=comareArrayLists(list1,list2);
	//print the result
	if(isEqual){
	System.out.println("The ArrayLists are equal.");

	}else{
	System.out.println("The ArrayLists are not equal.");
	}
	}
	public static <T>boolean comareArrayLists(ArrayList<T>list1,ArrayList<T>list2){

	//check if all ArrayLists have the same size
	if(list1.size()!=list2.size()){
	return false;
	}
	//check if all elements at the same index are equal
	for (int i=0;i<list1.size();i++){
	if(!list1.get(i).equals(list2.get(i))){
	return false;
	}
	}
	//if all elements are equal return true
	return true;
	}
}
