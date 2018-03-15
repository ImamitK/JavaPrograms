package multithreading;

class Display2 {
	public synchronized void wish() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public synchronized void wish2() {
		for (int i = 65; i < 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
	}
}

class MyThread4 extends Thread {

	Display2 d;
	public MyThread4(Display2 d) {
		this.d = d;
	}

	public void run() {
		d.wish();
	}

}

class MyThread5 extends Thread {

	Display2 d;
	public MyThread5(Display2 d) {
		this.d = d;
	}
	public void run() {
		d.wish2();
	}

}

public class Thread_Static_Synchronization_Demo {
	
	public static void main(String[] args) {
		Display2 d1 = new Display2();
		//Display1 d2 = new Display1();
		/*When multiple thread is executing on one object(d1 and d2 object)
		 *  then static synchronization is  not required
		*/
		MyThread4 t1 = new MyThread4(d1);
		MyThread5 t2 = new MyThread5(d1);

		t1.start();
		t2.start();
	}


}
