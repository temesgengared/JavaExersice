

package com.lem.array.exercise;

public class exercisereverseanarray {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		//analysis what to do?to reverse an array
		//how to do is just we have to swap number in same array,and 
		//we need two counter one in ASC and  one in DEC and stop condition if the number of array is odd stop
		//swapping when both  counter became equal;when the number of array is even stop swapping
	// when the counter 2 or descending counter less than the ASC
	int [] nums ={1,2,3,4};
	for (int counter1=0, counter2=nums.length-1;
			counter1<nums.length && counter2>=0;
			counter1++,counter2 --)
     {if (nums.length%2!=0 && counter1==counter2) {
	       break;
     }else if (counter2<counter1) {
	       break;
     }
     int swappingVariabe=nums[counter1];//1
     nums [counter1] = nums [counter2];//4
     nums [counter2]= swappingVariabe;//1
     
	 }
     System .out.println("Reversed array");
     for (int number:nums) {System .out.println(number);
}
}
}
