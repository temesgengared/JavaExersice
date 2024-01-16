package com.lemi.Abstraction.exercise;

public abstract class Employee {
	private String name;
	private String id;
	
	public abstract Double calculateSalary();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee =new FullTimeEmployee();
		System.out.println(employee.calculateSalary());

	}

}
class FullTimeEmployee extends Employee{
	public Double calculateSalary() {
		return 7000.00;
	}
}
class PartTimeEmployee extends Employee {
	public Double calculateSalary() {
		return 300.00;
	}
}
