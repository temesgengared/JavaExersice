package com.lem.Inhertance.exercise;

public class Shape {
	private Double ShapeArea;
	public Double area() {
		return this.ShapeArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(4.0);
		Shape rectangle=new Rectangle(2.0,3.0); 
		
		System.out.println("area of circle" +circle.area());
		System.out.println("area of Rectangle" +rectangle.area());

	}

}
class Circle extends Shape{
	private Double radius;
	Circle (Double radius){
		this.radius=radius;
	}
	public Double area() {
		return Math.PI*Math.pow(radius, 2);
	}
}
class Rectangle extends Shape{
	private Double L,W;
	Rectangle(Double L,Double W){//parameterized constructor
		this.L =L;//to initialized
		this .W=W;
	}
	public Double area() {
		return L*W;
	}
}