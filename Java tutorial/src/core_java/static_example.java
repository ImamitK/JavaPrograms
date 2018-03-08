package core_java;

public class static_example {

	public static void main(String[] args) {
		
		Emp emp = new Emp("Amit","27");
		Emp emp1 = new Emp("Amol","27");
		emp.display();
		emp1.display();
	}
}

class Emp{
	String emp_name;
	String emp_age;
	static String emp_company = "Sasken";
	
	public Emp(String emp_name, String emp_age) {
		this.emp_name = emp_name;
		this.emp_age = emp_age;
	}
	 void display (){System.out.println(emp_age+" "+emp_name+" "+emp_company);}  
}