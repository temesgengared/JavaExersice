package com.lem.Examples;

public class example3 {
	class Shape {
	    
      double calculateArea(double side) {
	        return side * side; // Overloaded method for squares
	    }

	    double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

		double calculateArea(double length, double width) {
	        return length * width; // Overloaded method for rectangles
	    }
	}
	//overriding
	class Circle extends Shape {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
		
	    double calculateArea() {
	        return Math.PI * radius * radius; // Overridden method for circles
	    }
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
