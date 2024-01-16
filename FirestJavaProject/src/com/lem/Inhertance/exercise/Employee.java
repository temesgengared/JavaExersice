package com.lem.Inhertance.exercise;

public class Employee {
	private String name;
	private Double salary;
	
	public Employee (String name, Double salary) {
		
		this .name=name;
		this .salary=salary;
	}
	public String toString() {
		return this.name +""+ this .salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager  manager =new Manager ("Berhe" ,3000.0,  2000.0);
		manager.displayNameandSalary();
		}

}
 class Manager extends Employee{
	 private Double bonus;
	 Manager (String name,Double salary,Double bouns){
		 super(name,salary);
		 this.bonus=bouns;
		 
	 }
	 public void displayNameandSalary() {
		 System.out.println(super.toString() +""  +this.bonus);
	 }
 }
