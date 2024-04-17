package module2;
/*Question20
* create a class named printNumber to print various number of different 
*data type by creating different methods with the same name 'printn' 
*having a parameter of each data type.
*/
public class PrintNumbers {
	public static void printArray(Integer[]arr){
		System.out.println("The Integer array is:");
		for(Integer i:arr)
		System.out.println(i+"");
		System.out.println();
		}

		public static void printArray(Character[]arr){
		System.out.println("\nThe Character array is:");
		for(Character i:arr)
		System.out.println(i+"");
		System.out.println();


		}
		public static void printArray(String[]arr){
		System.out.println("\nThe String array is:");
		for(String i:arr)
		System.out.println(i+"");
		System.out.println();
		}
		public static void printArray(Double[]arr){
		System.out.println("\nThe Double array is:");
		for(Double i:arr)
		System.out.println(i+"");
		System.out.println();
		}
		//main function
		public static void main (String[] args){
		Integer[] iarr={2,4,6,8,10};
		Character[]carr={'H','E','L','L','O'};
		String[]sarr={"Rupa","Arti","Jyoti","Divya"};
		Double[]darr={10.25,12.56,65.25,22.98,1.27,2.65};
		//call method
		printArray(iarr);
		printArray(carr);
		printArray(sarr);
		printArray(darr);
		}
		

}
