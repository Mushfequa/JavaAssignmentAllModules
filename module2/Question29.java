package module2;
/*Quesion29
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100,
 *$150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB'
 *and 'BankC' are subclasses of class 'Bank', each having a method named 
 *'getBalance'. Call this method by creating an object of each of the three
 * classes
 * 
 */
//Abstract class Bank
abstract class Bank {
 // Abstract method getBalance
 public abstract int getBalance();
}

//Subclass BankA
class BankA extends Bank {
 private int balance = 100; // Initial balance for Bank A

 // Implementation of getBalance method
 @Override
 public int getBalance() {
     return balance;
 }
}

//Subclass BankB
class BankB extends Bank {
 private int balance = 150; // Initial balance for Bank B

 // Implementation of getBalance method
 @Override
 public int getBalance() {
     return balance;
 }
}

//Subclass BankC
class BankC extends Bank {
 private int balance = 200; // Initial balance for Bank C

 // Implementation of getBalance method
 @Override
 public int getBalance() {
     return balance;
 }
}

//Main class for testing
public class Question29 {
	 public static void main(String[] args) {
	        // Create objects of each subclass
	        BankA bankA = new BankA();
	        BankB bankB = new BankB();
	        BankC bankC = new BankC();

	        // Call getBalance method for each bank
	        System.out.println("Balance in Bank A: $" + bankA.getBalance());
	        System.out.println("Balance in Bank B: $" + bankB.getBalance());
	        System.out.println("Balance in Bank C: $" + bankC.getBalance());
	    }
}
