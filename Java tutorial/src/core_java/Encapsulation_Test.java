package core_java;

/* Here Encapsulate class is encapsulated as the variable is declared as private and to read and write the data we need to 
 * user the getter and setter method.... java Been is the complete encapsulated class*/

class Encapsulate{
	private String geekName;
	private int geekRoll;
	private int geekAge;
	
	public String getGreekName() {
		return geekName;
	}
	public void setGeekName(String greekName) {
		this.geekName = greekName;
	}
	public int getGeekRoll() {
		return geekRoll;
	}
	public void setGeekRoll(int geekRoll) {
		this.geekRoll = geekRoll;
	}
	public int getGeekAge() {
		return geekAge;
	}
	public void setGeekAge(int geekAge) {
		this.geekAge = geekAge;
	}
	
}

public class Encapsulation_Test {

	public static void main(String[] args) {
		
		Encapsulate obj = new Encapsulate();
		
		obj.setGeekName("Amit");
		obj.setGeekRoll(100);
		obj.setGeekAge(27);
		
		System.out.println("geek Name is "+obj.getGreekName());
		System.out.println("geek Roll is "+obj.getGeekRoll());
		System.out.println("geek Age is "+obj.getGeekAge());
	}

}
