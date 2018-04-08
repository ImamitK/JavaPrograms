package multithreading;

class Parent{
	
	public static synchronized void get(){
		while(true) {
			System.out.println("get method called");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	public  void put(){
		while(true) {
			System.out.println("put method called");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class Test_Syncronized {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				p.get();
			}
		});
		
		Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				p.put();
			}
		});
		
		t1.start();
		t2.start();
	}

}

 /*case 1 : method get() is void  && method put() is void
  	output :put method called
get method called
get method called
put method called
.......
   case 2 : method get() is synchronized & void  &&  method put() is void
  	output :put method called
get method called
get method called
put method called
........
   case 3 : method get() is synchronized & void  &&  method put() is synchronized & void
  	output :get method called
get method called
get method called
get method called
.......
   case 4 : method get() is static & synchronized & void  &&  method put() is synchronized & void
	SAME AS : method get() is static & synchronized & void  &&  method put() is void
  	output :put method called
get method called
get method called
put method called
.......
(static methods lock on the class object of the class. Non-static methods lock on the instance
on which they're called (by default, synchronized(anyOtherLock) is also possible). 
Since they lock on different objects, they don't block each other.)
				
   case 5 : method get() is static & synchronized & void  &&  method put() is static & synchronized & void
  	output :put method called
put method called
put method called
put method called
........
			
Note : 1) (I)synchronized void test() { foo(); } EQUALS (II) void test() { synchronized(this) { foo(); } 
       2) (I)static synchronized void test() { foo(); } EQUALS (II)static void test() { synchronized(MyClass.class) { foo(); } }
*/ 
