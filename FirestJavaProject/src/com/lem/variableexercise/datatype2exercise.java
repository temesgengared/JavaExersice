
package com.lem.variableexercise;

public class datatype2exercise {


	public static void main(String[] args) {
		//NumberLimits
		
		final int integerMax = Integer.MAX_VALUE;
		final int integerMin= Integer.MIN_VALUE;
		System.out.println("Integer Max"+ integerMax);
		System.out.println("Integer Min"+integerMin);
		//type conversion
		
		double price = 4.99;
		int priceInt = (int)price;
		System.out.println("parsed price"+priceInt);
		
		int age=30;
		double ageDouble=age;
		System.out.println("Age"+ageDouble);
		
		//	type conversion
		// Implicit widening/ conversion from int to float and double /from small to a large datatype
        int num1 = 30;
        double double1=num1;
        float float1 = num1; 
        
        System.out.println("Integer " + num1 );
        System.out.println("Float " + double1 );
        System.out.println("Float " + float1 );
        
         // Explicit/narrowing conversion from double to  float and int/ from large data type to small data type manually
        double doubleNum = 15.20;
        int intNum = (int) doubleNum; 
        System.out.println("Double number: " + doubleNum);
        System.out.println(" Integer number: " + intNum);
    

       
		
				
		
		
		

	}

}
