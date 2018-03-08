package Complex;

/*The reason for printing “Not Equal” is simple: when we compare c1 and c2, it is checked 
 * whether both c1 and c2 refer to same object or not (object variables are always references in Java). 
 * c1 and c2 refer to two different objects, hence the value (c1 == c2) is false. If we create another reference 
 * say c3 like following, then (c1 == c3) will give true.
  Complex c3 = c1;  // (c3 == c1) will be true
*/

class Complex {
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public boolean equals(Object o){
		
		if(o == this){
			return true;
		}
		
		if(!(o instanceof Complex)){
			return false;
		}
		
		Complex complex = (Complex) o;
		
		return Double.compare(re, complex.re)==0 && Double.compare(im, complex.im)==0;
	}
}

public class Overriding_equals_Method_test {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		if (c1.equals(c2)) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}
	}

}
