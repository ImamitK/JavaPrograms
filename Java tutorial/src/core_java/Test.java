package core_java;

class A111{
	protected  void draw(){
		System.out.println("hello World");
	}
}


public class Test extends A111 {
	
	 public void draw(){
		System.out.println("Good Morning");
	}
	
	private String function(String temp, int data)
    {
        return ("GFG");
    }
    private String function(int data, String temp)
    {
        return ("GeeksforGeeks");
    }

	public static void main(String[] args) {
		Test obj = new Test();
        System.out.println(obj.function(4, "GFG")); 
        obj.draw();
	}

}
