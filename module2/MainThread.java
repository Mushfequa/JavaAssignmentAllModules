package module2;
/*Question 42
 * W.A.J.P to create one thread by implementing Runnable interface in class .
 */
class MyRunnable implements Runnable{
public void run(){
//code to be executed by the thread
for(int i=0;i<5;i++){

System.out.println("Thread is running:"+i);
try{
Thread .sleep(1000);//sleep for 1 second
}catch(InterruptedException e){
e.printStackTrace();
}
}
}
}
public class MainThread {
	public static void main(String[] args){

		MyRunnable myRunnable=new MyRunnable();//instantiate your class
		Thread thread =new Thread (myRunnable);//create a thread passing your runnable object
		thread.start();//start the thread
		}
}

