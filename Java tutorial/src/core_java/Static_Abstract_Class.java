package core_java;

abstract class TestAbstractClass {
    static void testStaticMethod(){
        System.out.println("In Parent class static method");
    }
}

//child class
public class Static_Abstract_Class extends TestAbstractClass {
    public static void main(String[] args) {
        TestAbstractClass parentObj = new Static_Abstract_Class();
        parentObj .testStaticMethod();
        
        Static_Abstract_Class childObj = new Static_Abstract_Class();
        childObj.testStaticMethod();
        
        TestAbstractClass.testStaticMethod();
        
        Static_Abstract_Class.testStaticMethod();
    }
}

