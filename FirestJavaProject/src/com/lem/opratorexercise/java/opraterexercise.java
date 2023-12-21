/**
 * 
 */
package com.lem.opratorexercise.java;

public class opraterexercise {

	public static void main(String[] args) {
		// Arithmetic operator
		
		double num1 =6, num2=3;
		double quotient =num1 /num2;//2
		double remainder = num1%num2;//0
		System .out.println("Quotient " + quotient);
		System .out.println("remainder " + remainder);
		
		// Relational operator   ==
		double result =num1==num2?0:num1>num2?num1:num2;//Ternary operator
		System .out .println(result);
		
		//unary operators ++ -- +- -= ~
		
		int counter =0;
		int firstCounter =counter++;
		System .out .println("first counter "+ firstCounter);//0
		int secondCounter = ++counter;//2
		System .out .println("second counter "+ secondCounter);
		
		//Logical operator num1 is divisible by 2 & 3 %,&& ||e.g 6
		boolean isdivisible = num1% 2 == 0  && num1 %3==0? true:false;
		System . out .println ("is Divisible "+ isdivisible );
		
		//Assignment Operator 6/2 2/2
		double halve =num1<1?0:num1/2;//3
		halve = halve < 1?0:halve/2;//1.5
		halve = halve < 1?0:halve/2; //0.75
		halve = halve < 1?0:halve/2; //0.0
		System .out .println("halve " + halve);
		
		//conditional operator
		
		double  num3 =20; 
		String result1=num3>0?"Positive":num3<0?"Negative":"Zero";
		System .out.println("number "+ result1);
		
		
		
		
		
		
		
		
	
		

	}

}
