package com.lem.Inhertance.exercise;

public class Vehicle {
	public  void fuelSource() {
		System.out.println("Vehicle fuel,");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle =new Vehicle();
		Vehicle car =new Car();
		Vehicle bicycle =new Bicycle();
		
		vehicle .fuelSource ();
		car .fuelSource();
		bicycle.fuelSource();
}

}
  class Car extends Vehicle{
	  public void fuelSource() {
		  System.out.println ("Car fuel");
	  }
  }
  class Bicycle extends Vehicle{
	  public void fuelSource() {
		  System.out.println ("Bicycle fuel");
	  }
  }
  
  
