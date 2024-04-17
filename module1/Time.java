package module1;


/*
 * W.A.J.P to display the system time.
 */


	import java.time.format.DateTimeFormatter;
	import java.time.LocalDateTime;
	  public class Time{
	  public static void main(String[]args){
	  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyy/MM/dd HH:ss");
	  LocalDateTime now=LocalDateTime.now();
	  System.out.println(dtf.format(now));
	  
	  }
	  
	  } 


