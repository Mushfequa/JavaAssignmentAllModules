package module2A;

/*
 * create an abstract class parent with a method 'message'.it has two subclasses each having a 
 * method with the same name 'message' that prints "This is first subclass and "This is second 
 * subclass"respectively call the methods 'message' by creating an object for each subclass
 * 
 * 
 */
abstract class Parent{
	
	abstract void message() ;
		
	}
	class FirstSubclass extends Parent{
		void message() {
			System.out.println("This is first subclass");
		}
	}
	class SecondSubclass extends Parent{
		void message() {
			System.out.println("This is second subclass");
		}
}
public class Question28 {
	public static void main(String[] args) {
		FirstSubclass f=new FirstSubclass();
		f.message();
		SecondSubclass s = new SecondSubclass();
		s.message();
		
	}

}
