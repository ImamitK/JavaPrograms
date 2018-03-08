package core_java;

public class Final_Parameter_Example {
	
	int cube(final int n){  
		 //  n=n+2;//can't be changed as n is final  
		  return n*n*n;  
}

	public static void main(String[] args) {
		Final_Parameter_Example f = new Final_Parameter_Example();
		f.cube(6);
	}

}
