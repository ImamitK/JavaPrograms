package multithreading;

class Display1 {
	public void wish(String name) {
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

class MyThread3 extends Thread {

	Display1 d;
	String name;

	public MyThread3(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}

}

public class Thread_Synchronization_Demo2 {

	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		/*When multiple thread is executing on other object(d1 and d2 object)
		 *  then synchronization is  not required
		*/
		MyThread3 t1 = new MyThread3(d1, "Amit");
		MyThread3 t2 = new MyThread3(d2, "Amol");

		t1.start();
		t2.start();
	}

}
