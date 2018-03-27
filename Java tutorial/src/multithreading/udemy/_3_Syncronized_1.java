package multithreading.udemy;

public class _3_Syncronized_1 {

	private static int counter = 0;
	
	
	/* As it is a static synchronized method only one thread 
	 * will be able to access the method at a given time
	 * */
	private static synchronized void increment() {
		++counter;
	}

	public static void process() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					increment();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		process();
		System.out.println(counter);
	}

}
