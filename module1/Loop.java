package module1;


	
/*
 * Question4
 * W.A.P in java to input 5 numbers from keybord and find their sum and averageusing for loop
 */
	public class Loop {
		public  static void main(String[]args){
	int[] numbers={1,2,3,4,5,};
	double sum=0;
	for(int i=0;i<numbers.length;i++){
		sum+=numbers[i];
	}		
			double average=sum/numbers.length;
			System.out.println("sum:"+sum);
			System.out.println(average);
			
		}
		
		
		
	}

