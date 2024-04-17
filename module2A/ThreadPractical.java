package module2A;



/*Question 44
* W.A.J.P to create 2 threads and execute that threads by providing sleep time as
*2000ms and check the execution. 
*/
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + threadName + " is running: " + i);
                Thread.sleep(2000); // Sleep for 2000 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
}
public class ThreadPractical {
	public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread1.start();
        thread2.start();
    }
}
