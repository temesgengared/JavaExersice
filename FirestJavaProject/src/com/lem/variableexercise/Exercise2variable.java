
package com.lem.variableexercise;
public class Exercise2variable {

public static void main(String[] args) {
		
		//Declaration&Initializetion
	     int a=50;
		 double b=30.2;
		 char letter ='B';
	     System.out.println(a);
		 System.out.println(b);
		 System.out.println(letter);
				
		//Reassignment
		  int salary=3000;
		  salary=2000;
		  System.out.println("salary"+salary);
				
		//String concatenation
			String Firestname="nathan";
			String lastname="desu";
			System.out.println(Firestname.concat (lastname));
			System.out.println(Firestname +" "+ lastname);
			
			//math operations
			 int number1= 1;
			 int number2= 2;
			 int diff=number1-number2;
			 int mul=number1*number2;
			 double div =number1/number2;
			 int sum =number1+number2;
			 
			 double number3=1, number4=2;
			 double div2=number3/number4;
			System.out.println("sum:"+sum);
			System.out.println("diff:"+diff);
			System.out.println("mul:"+mul);
			System.out.println("div:"+div2);
			
			//temperature
			float celsius =   40;
			float fraction =  9/5;
			float farenheit =(celsius*fraction)+32;
			System.out.println("Celsius"  + celsius);
			System.out.println("Farenheit"  + farenheit);
			
			//swapping variables
			
			int one = 3, two=4;
			one = one + two; //7
			two =one -(two); //7-4=3
			one = one -(two); //7-3 =4
			System .out.println(one);
			System .out .println(two);
			
			// area of circle
			
			double radius =1.1;
			final double PI=3.14;
			double area =PI*radius*radius;
			System.out.println("area " + area);
			
			// Average of numbers
			int num1 =1,  num2 =2,  num3 =3 ;
			double avg =(num1 + num2 + num3)/3;
			System.out.println("Avareg"  + avg);
			
			
			
			
			
			
			
			
				
				 

	}

}
