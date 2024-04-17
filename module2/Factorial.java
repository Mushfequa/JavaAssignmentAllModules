package module2;
/*
* Question31
* Write a program to print the factorial of a number by defining a method named
* Factorial'. Factorial of any number n is represented by n! And is equal to
*  1*2*3*.
*  *(n-1) *n. E.g.-
*4! = 1*2*3*4 = 24
*3! = 3*2*1 = 6
*2! = 2*1 = 2
*Also, 1! = 1
*0! = 0
 */
public class Factorial {
	public static void main(String[]args){
		System.out.println("factorial of 4:"+ factorial(4));
		System.out.println("factorial of 3:"+ factorial(3));
		System.out.println("factorial of 2:"+ factorial(2));
		System.out.println("factorial of 1:"+ factorial(1));
		System.out.println("factorial of 0:"+ factorial(0));
	}
	public	static int factorial(int n){
		if(n==0||n==1) {
		return 1;
		}else {
			int result=1;
			for(int i=2;i<=n;i++) {
				result*=i;
			}
			return result;
		
		}

		
		
		}
}
