package multithreading;

class Q{
	
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num){
		while(valueSet){
			try{ wait();} catch(InterruptedException e){} 
		}
		System.out.println("put : "+num);
		this.num = num;
		valueSet = true;
		notify();
	}
	
	public synchronized void get(){
		while(!valueSet){
			try{ wait();} catch(InterruptedException e){} 
		}
		System.out.println("get : "+num);
		valueSet = false;
		notify();
	}
}

class Producer extends Thread{
	
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			try{ Thread.sleep(1000);} catch(InterruptedException e){} 
		}
	}
	
	
}

class Consumer extends Thread{
	
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	public void run(){
		while(true){
			q.get();
			try{ Thread.sleep(1000);} catch(InterruptedException e){}
		}
	}
}


public class Producer_Consumer_Problem {

	public static void main(String[] args) {
		
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
		
	}

}
