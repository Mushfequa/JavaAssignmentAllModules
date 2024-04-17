package module2;
/*Question 50
 * W.A.J.P to update specific  array element by given element.
*/

public class UpdateArrayElement {
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		updateElement(arr,2,10);
		for(int num:arr){
		System.out.println(num+" ");
		}

		}
		public static void updateElement(int[] arr,int index,int newValue){
		if(index>=0&&index<arr.length){
		arr[index]=newValue;
		System.out.println("Element at index"+index+"updated succesfully.");

		}else{

		System.out.println("Index out of bounds.cannot update element.");
		}

		}

}
