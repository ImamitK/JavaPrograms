package core_java;

//Java program to demonstrate that we can have
// different return types if return type in
// overridden method is sub-type
// Two classes used for return types.
class A1 {}

class B1 extends A1 {}

class Base {
	A1 fun() {
		System.out.println("Base fun()");
		return new A1();
	}
}

class Derived extends Base {
	B1 fun() {
		System.out.println("Derived fun()");
		return new B1();
	}
}

public class Covariant_Return_Type_Test {

	public static void main(String[] args) {
		Base base = new Base();
		base.fun();

		Derived derived = new Derived();
		derived.fun();
	}

}
