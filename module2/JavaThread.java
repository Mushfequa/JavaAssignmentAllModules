package module2;
/*Question 43
 * W.A.J. P to create one thread by extending Thread class in another Class.
 */
class MyThread extends Thread{
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
public class JavaThread {
	public static void main(String[] args){


		MyThread mythread =new MyThread ();//instantiated your extended class
		mythread.start();//start the thread
		}
		}
}
