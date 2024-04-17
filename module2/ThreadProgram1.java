package module2;
/*Question 45
* W.A.J.P to start the same Thread twice by calling start () method twice. Test
*ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
*/
public class ThreadProgram1 {
	public static void main(String[] args){
		 TestThreadTwice1 t1= new TestThreadTwice1();
		 t1.start();// start the thread for the first time
		 t1.start();// Attempt to start the thread again
		}
		}
		class TestThreadTwice1 extends Thread{
		public void run(){
		System.out.println("Thread is running.");
		}
		}

