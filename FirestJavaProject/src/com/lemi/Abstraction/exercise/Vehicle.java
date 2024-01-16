package com.lemi.Abstraction.exercise;

public abstract class Vehicle {
	public abstract Double fuelEfficiency ();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Car ();
		System.out.println(vehicle.fuelEfficiency());
		
		Vehicle vehicle1=new Bike ();
		System.out.println(vehicle1.fuelEfficiency());


	}

}
class Car extends Vehicle{
	public Double fuelEfficiency() {
		return 7.0;
	}
}
class Bike extends Vehicle{
	public Double fuelEfficiency() {
		return 5.0;
}

}
