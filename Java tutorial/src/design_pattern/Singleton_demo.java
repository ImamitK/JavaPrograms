package design_pattern;

class Singleton{
	
	private static volatile Singleton instance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(null == instance){
			synchronized(Singleton_demo.class){ 
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public void doSomething(){
		System.out.println("Singleton Demo"+"  "+instance.getClass().getName());
	}
}

public class Singleton_demo {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.doSomething();
		System.out.println(s.hashCode());
		Singleton s1 = Singleton.getInstance();
		s1.doSomething();
		System.out.println(s1.hashCode());
		
	}

}
