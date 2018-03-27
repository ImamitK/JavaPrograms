package multithreading.udemy;

class Runner1{
	public void startRunning(){
		for(int i=0; i<10; i++){
			System.out.println("Runner 1 is running");
		}
	}
}

class Runner2{
	public void startRunning(){
		for(int i=0; i<10; i++){
			System.out.println("Runner 2 is running");
		}
	}
}

public class _1_sequentialProcessing {

	public static void main(String[] args) {
		Runner1 run1 = new Runner1();
		run1.startRunning();
		Runner2 run2 = new Runner2();
		run2.startRunning();
	}

}
