package com.lem.Examples;



// Encapsulation
class Person{
    
    private String Name="temesgen";
    

    //Getter and Setter methods
     public String getName(){
        return Name;
    }

    public void setName(String newValue){
        Name = newValue;
    }

  public static void main(String args[]){
    	Person person  = new Person();
         person.setName("salem");
         
         System.out.println(" Name: " + person.getName());
         
    }
    
}

//overloading
class Overloading
{
  //adding two integer numbers
  int add(int a, int b)
  {
    int sum = a+b;
    return sum;
  }
  //adding three integer numbers
  int add(int a, int b, int c)
  {
    int sum = a+b+c;
    return sum;
  }


  public static void main(String args[])
  {
    Overloading obj = new Overloading();
    System.out.println(obj.add(10, 20));
    System.out.println(obj.add(10, 20, 30));
  }
}

//static keyword
class StaticExample
{
    // This is a static method
    static void myCar()
    {
        System.out.println("mycar");
    }
 
    public static void main(String[] args)
    {
           myCar();
          
    }
    //inhertance
    
    public class person {
    	public void eat () {
    		System.out.println("person eat.");
    		
    	}
    	class student extends person{
    		@Override
    		public void eat() {
    			System.out.println("student eat");
    		}
}}}