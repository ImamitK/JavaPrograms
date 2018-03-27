package multithreading.udemy;

class Runner3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner 1 is running "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner4 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner 2 is running "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner5 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner 3 is running "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner6 extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner 4 is running "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class _2_multithreadedProcessing {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runner3());
		Thread t2 = new Thread(new Runner4());
		Runner5 t3 = new Runner5();
		Runner6 t4 = new Runner6();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished the task...");
	}

}
