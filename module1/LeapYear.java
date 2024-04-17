package module1;
	/*
	 * 
	 * Question3
	 * 
	 * Write a java program that takes a year from user and print whether that year is a leap year or not .write a program in java to display the first 10 numbers using while loop
	 * 
	 * 
	 */
	

	import java.util.Scanner;

	public class LeapYear {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the year:");
			int year=sc.nextInt();
			boolean x=(year%4)==0;
			boolean y=(year%100)!=0;
			boolean z=(year%100==0)&&(year%400==0);
			
			if(x &&(y||z)) {
				System.out.println("year is leap year+year");
				
			}else {
				System.out.println("year is not leap year+year");
				
			}
			
		}
	}


