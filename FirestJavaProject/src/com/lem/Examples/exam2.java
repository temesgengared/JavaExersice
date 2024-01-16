package com.lem.Examples;

class exam1 {
    public exam1() {
        System.out.println("A");
    }
}

public class exam2 extends exam1 {
    public exam2() {
        // Implicitly calls the default constructor of class A
        System.out.println("B");
    }

    public static void main(String[] args) {
        exam2  Exam2= new exam2();
//        

    }
   }      
// subclass to invoke  superclass 

class persons {
    private int age;

   // Parameterized constructor
    public persons(int age) {
        this.age = age;
        System.out.println("person: " + age);
    }
}

class student  extends persons {
    private String name;

    // Subclass constructor
    public student(String name, int age) {
        super(age); // Calls the parameterized constructor of the superclass
        this.name = name;
        System.out.println("student : " + name);
    }

public static void main(String[] args) {
    	student obj = new student("name", 42);
        // Output:
        // Superclass constructor with value: 42
        // Subclass constructor with name: Example
    }
}
