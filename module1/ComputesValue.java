package module1;
/*Question10
 * Write a Java program that accepts an integer (n) and computes the value of 
 * n+nn+nnn. Input number: 5 5 + 55 + 555 •
 * 
 */

public class ComputesValue {
	public static void main(String[] args) {
        int n = 5;
        char s1, s2, s3;
     // Display the number in a specific pattern.
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
}
}