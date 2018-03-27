package multithreading;

class ImplementsRunnable implements Runnable{
	
	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ImplementsRunnable : Counter : " + counter);
	}
}

class ExtendsThread extends Thread{
	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ExtendsThread : Counter : " + counter);
	}
}


public class ThreadVsRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*	When you extends Thread class, each of your thread creates unique object and associate with it.
		  	When you implements Runnable, it shares the same object to multiple threads.
		*/
		
		//Multiple threads share the same object.
		ImplementsRunnable rc = new ImplementsRunnable();
		Thread t1 = new Thread(rc);
		t1.start();
		Thread.sleep(1000);
		Thread t2 = new Thread(rc);
		t2.start();
		Thread.sleep(1000);
		Thread t3 = new Thread(rc);
		t3.start();
		
		//Creating new instance for every thread access.
		ExtendsThread tc1 = new ExtendsThread();
		tc1.start();
		Thread.sleep(1000);
		ExtendsThread tc2 = new ExtendsThread();
		tc2.start();
		Thread.sleep(1000);
		ExtendsThread tc3 = new ExtendsThread();
		tc3.start();
	}

}