package multithreading;

public class EvenOddThread {

	static boolean isEven = false;

	public static void main(String[] args) {
		Object o = new Object();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (o) {
					for (int i = 0; i <= 20; i = i + 2) {
						while (isEven) {
							try {
								o.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println(Thread.currentThread().getName() + "   " + i);
						isEven = !isEven;
						o.notifyAll();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (o) {
					for (int i = 1; i <= 20; i = i + 2) {
						while (!isEven) {
							try {
								o.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println(Thread.currentThread().getName() + "   " + i);
						isEven = !isEven;
						o.notifyAll();
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}