
package com.lem.array.exercise;


public class Exerciseminandmax {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// analysis
		// compare every element in array against each other then pick the Min and Max  accordingly
		//how to do  we have to variable min and max and we have to initialize them with min & max with the first array element.
		
		int []arr = {1,2,3};
		int min = arr[0], max= arr[0];
		for (int num :arr) 
		     {if (num<min) {
			min=num;}
		     if (num>max) {
             max=num;
		
		}

	}
       System .out.println("MIN"     + min);
       System .out.println("MAX"     + max);
       
    
       
           
      
}
	}
