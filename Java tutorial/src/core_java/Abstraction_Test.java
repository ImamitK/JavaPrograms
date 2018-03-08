package core_java;

abstract class Shape{
	String color;
	
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	public static void printHello(){
		System.out.println("Hello World");
	}
}

class Circle extends Shape{
	
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius; 
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.color + " and area is : " + area();
	}
}

class Triangle extends Shape{
	
	double length;
	double width;

	public Triangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + " and area is : " + area();
	}
	
}

public class Abstraction_Test {

	public static void main(String[] args) {
		
		Shape circle = new Circle("Red", 20);
		Shape triangle = new Triangle("yellow", 3, 5);
		Shape.printHello();
		System.out.println(circle.toString());
        System.out.println(triangle.toString());
        
        boolean[] boolArr = new boolean [] {true,true,false,true};
        System.out.println(boolArr.toString());
        
        
        
	}
}
