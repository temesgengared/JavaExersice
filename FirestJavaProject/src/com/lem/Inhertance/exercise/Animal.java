package com.lem.Inhertance.exercise;

public class Animal {
	public void sound () {
		System.out.println("Animal sound.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animal animal=new Dog();
	animal.sound();
	Mammal mammal=new Dog ();
	mammal .breastFeeding();
		

	}

}
class Mammal extends Animal{
	@Override
	public void sound() {
		System.out.println("Mamal sound");
	}
	public void breastFeeding() {
		System.out.println("Mamals are breast feeding");
	}
}
class Dog extends Mammal{
	
}
