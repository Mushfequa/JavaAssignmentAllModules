package module2;
/*Question 41
* W.A.J.P to create a class Student with attributes roll no, name, age and 
*course.Initialize values through parameterized constructor. If age of student 
*is not in between 15 and 21 then generate user defined exception
*"AgeNotWithinRangeException". If name contains numbers or special symbols
*raise exception "NameNotValidException". Define the two exception classes. 
*/
//Custom exception class for AgeNotWithinRangeException
class AgeNotWithinRangeException extends Exception {
 // Constructor to initialize the exception message
 public AgeNotWithinRangeException() {
     super("Age is not within the range of 15 to 21");
 }
}

//Custom exception class for NameNotValidException
class NameNotValidException extends Exception {
 // Constructor to initialize the exception message
 public NameNotValidException() {
     super("Name is not valid. It should not contain numbers or special symbols");
 }
}

//Student class
class Student {
 // Attributes
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor to initialize attributes
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     // Validate age
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException();
     }

     // Validate name
     if (!name.matches("[a-zA-Z\\s]+")) {
         throw new NameNotValidException();
     }

     // Initialize attributes
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Method to display student details
 public void displayDetails() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

//Main class for testing
public class ExceptionRange {
	 public static void main(String[] args) {
	        try {
	            // Create a student object with valid data
	            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
	            student1.displayDetails();

	            System.out.println();

	            // Create a student object with invalid age
	            Student student2 = new Student(2, "Alice123", 22, "Mathematics");
	            student2.displayDetails(); // This line won't be executed due to exception

	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            // Catch and handle AgeNotWithinRangeException and NameNotValidException
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }

}
