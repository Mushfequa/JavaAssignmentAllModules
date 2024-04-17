package module1;


	/*
	 * Question1
	 * WAP to take three numbers from the user and print the greatest numbers
	 * 
	 * 
	 */

	import java.util.Scanner;
	public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1:");
		int num1=sc.nextInt();
		System.out.println("enter the num2:");
		int num2=sc.nextInt();
		System.out.println("enter the num3:");
		int num3=sc.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("greatest number: "+num1);
		}
		else if((num2>num1)&&(num2>num3))  {
			
			System.out.println("greatest number: "+num2);
		}else if ((num3>num1)&&(num3>num2)){
			System.out.println("greatest number: "+num3);
		}
	}
	}


