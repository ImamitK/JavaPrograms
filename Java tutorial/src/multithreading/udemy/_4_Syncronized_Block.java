package multithreading.udemy;

public class _4_Syncronized_Block {
	
	private static int count1 = 0;
	private static int count2 = 0;
	
	private static Object obj1 = new Object();
	private static Object obj2 = new Object();
	
	public static void add(){
		synchronized (obj1) {
			count1++;
		}
	}
	
	public static void addAgain(){
		synchronized (obj2) {
			count2++;
		}
	}
	
	public static void compute(){
		for(int i=0; i<100; i++){
			add();
			addAgain();
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static synchronized void add1(){
		count1++;
	}
	
	public static synchronized void addAgain1(){
		count2++;
	}
	public static void compute1(){
		for(int i=0; i<100; i++){
			add1();
			addAgain1();
		}
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				compute();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				compute();
			}
		});
		
		
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				compute1();
			}
		});
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				compute1();
			}
		});
		
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
		
		System.out.println("count 1 : "+count1+"   count 2 : "+count2);
		
	}
}
