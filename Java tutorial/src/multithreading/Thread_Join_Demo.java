package multithreading;

class MyThread1 extends Thread {
	static Thread mt;
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Thread_Join_Demo {

	public static void main(String[] args) {
		//MyThread1.mt = Thread.currentThread();   assigning mt current thread
		MyThread1 t = new MyThread1();
		try {
			t.start();
			t.join();
			for (int i = 0; i < 10; i++) {
				System.out.println("Main Thread running");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		} catch (InterruptedException e) {}
	}
}
