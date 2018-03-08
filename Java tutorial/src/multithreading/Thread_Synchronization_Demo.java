package multithreading;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

class MyThread2 extends Thread {

	Display d;
	String name;

	public MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}

}

public class Thread_Synchronization_Demo {

	public static void main(String[] args) {
		Display d = new Display();
		/*When multiple thread is executing on 1 object(d object)
		 *  then synchronization is required
		*/
		MyThread2 t1 = new MyThread2(d, "Amit");
		MyThread2 t2 = new MyThread2(d, "Amol");

		t1.start();
		t2.start();
	}

}
