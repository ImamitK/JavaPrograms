package multithreading;

public class Even_Odd_Print_2_Threads {

	static boolean isEven = false;

	public static void main(String[] args) {
		Object o = new Object();
		Thread tEven = new Thread(new EvenThread(o));
		Thread tOdd = new Thread(new OddThread(o));
		tEven.start();
		tOdd.start();
	}

	static class EvenThread implements Runnable {
		Object o;

		public EvenThread(Object o) {
			this.o = o;
		}

		@Override
		public void run() {
			synchronized (o) {
				for (int i=0; i<=50; i=i+2) {
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
	}

	static class OddThread implements Runnable {
		Object o;

		public OddThread(Object o) {
			this.o = o;
		}

		@Override
		public void run() {
			synchronized (o) {
				for (int i=1; i<=50; i = i+2) {
					try {
						while (!isEven) {
							o.wait();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println(Thread.currentThread().getName() + "   " + i);
						isEven = !isEven;
						o.notifyAll();
					}
				}
			}
		}
	}
}