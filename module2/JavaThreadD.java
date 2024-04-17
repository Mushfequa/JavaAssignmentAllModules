package module2;

/*Question 46
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
*Daemon () method of Thread class and check whether the thread is set daemon or
*not by using is Daemon () method.
*TestDaemonThread2 t1=new TestDaemonThread2();
*TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
*t1.setDaemon(true);//will throw exception here t2.start(); 
*/
class TestDaemonThread2 extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class JavaThreadD {
	 public static void main(String[] args) {
	        TestDaemonThread2 t1 = new TestDaemonThread2();
	        TestDaemonThread2 t2 = new TestDaemonThread2();
	        
	        t1.setDaemon(true); // Set t1 as a daemon thread before starting
	        
	        t1.start();
	        
	        // Attempting to set t1 as daemon after starting it will throw an IllegalThreadStateException
	        // t1.setDaemon(true); 
	        
	        t2.start();
	        
	        // Check whether t1 is a daemon thread
	        System.out.println("Is t1 a daemon thread? " + t1.isDaemon());
	        
	        // Check whether t2 is a daemon thread
	        System.out.println("Is t2 a daemon thread? " + t2.isDaemon());
	    }
}
