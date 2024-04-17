package module1;


	/*
	 * Question2
	 * 
	 * WAP that takes the user to provide a single character from the alphabet.print vowel or consonant on the user input .if the user input is not a letter(between a and z) or is string of length>1,print an error message
	 * 
	 */
	

	import java.util.Scanner;
	public class Alphabet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("input an alphabet:");
		String input=sc.next().toLowerCase();
		boolean UpperCase=input.charAt(0)>=65 && input.charAt(0)<=90;
		boolean LowerCase=input.charAt(0)>=95 && input.charAt(0)<=120;
		boolean vowels=input.equals("a")||input.equals("e")||input.equals("o")||input.equals("u");
		if(input.length()>1) {
			System.out.println("Error Not a single character");
			
			
		}else if(!(UpperCase||LowerCase)) {
			System.out.println("Error Not a letter. Enter UpperCase and LowerCase");
		}else if(vowels) {
			System.out.println("input letter is vowel");
		}else {
			System.out.println("input letter is consonant");
		}
	}
	}

