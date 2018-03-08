package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreeThreadsOrderedLockLess {

	AtomicInteger sharedOutput = new AtomicInteger(0);

	public static void main(String args[]) {

		ThreeThreadsOrderedLockLess t = new ThreeThreadsOrderedLockLess();

		Thread ts1 = new Thread(t.new ThreadTasks(0));
		Thread ts2 = new Thread(t.new ThreadTasks(1));
		Thread ts3 = new Thread(t.new ThreadTasks(2));
		Thread ts4 = new Thread(t.new ThreadTasks(3));
		ts1.start();
		ts2.start();
		ts3.start();
		ts4.start();
	}

	private class ThreadTasks implements Runnable {

		private final int threadPosition;

		public ThreadTasks(int threadPosition) {
			this.threadPosition = threadPosition;
		}

		@Override
		public void run() {

			while (sharedOutput.get() < 11) {

				if (sharedOutput.get() % 4 == this.threadPosition) {
					System.out.println(sharedOutput.get() % 4);

					int value = sharedOutput.get() + 1;
					System.out.println("Printing output for Thread: " + this.threadPosition + "  " + value);
					sharedOutput.incrementAndGet();
				}
			}
		}
	}
}
