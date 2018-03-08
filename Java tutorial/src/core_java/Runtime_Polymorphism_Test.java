package core_java;

/* In polymorphism 1 task can be performed by different ways.
 * Runtime Polymorphism is achieve by Method overriding concept in which type of object is determine at runtime.
 * we can override methods only, not the variables(data members)*/

class A{
	int x = 10;
	public void m1(){
		System.out.println("Inside A's m1 method");
	}
}

class B extends A{
	int x = 20;
	public void m1(){
		System.out.println("Inside B's m1 method");
	}
}

class C extends A{
	int x = 30;
	public void m1(){
		System.out.println("Inside C's m1 method");
	}
}
public class Runtime_Polymorphism_Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref = a;
		System.out.println(ref.x);
		ref.m1();
		
		ref = b;
		System.out.println(ref.x);
		ref.m1();
		
		ref = c;
		System.out.println(ref.x);
		ref.m1();
	}

}
