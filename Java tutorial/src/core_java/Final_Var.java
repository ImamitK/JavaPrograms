package core_java;

public class Final_Var {
	
	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder("Geeks");
        
        System.out.println(sb);
         
        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForGeeks");
        sb.append("ForGeeks");
         
        System.out.println(sb);
        
        final int i;
        i = 20; 
        //i = 30; // this is not possible in java and throws error
        System.out.println(i);
	}

}
