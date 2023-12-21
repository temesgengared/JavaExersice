
package com.lem.array.exercise;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//analysis create third new array that stores
		//the value of two sorted arrays
		// how to do ? itreate over the firest array then contiune on the second array
		//use built in function if there is
		
		int[] array1 = {1,2,3},array2 = {4,5,6},
				array3= new int [array1.length + array2.length];
		for (int i=0;i<array1.length;i++) {
			array3 [i]=array1[i];//copy the firest array element to third array
		}
		for (int i=array1.length,j=0; i<array3.length;i++,j++) {
			array3[i]= array2[j];//copy the second array element to third array
		}
		//print out the element of the merged array
		System .out .print("{");
		for (int i=0; i<array3.length;i++) {
			System .out .print(array3[i]+",");
		}
		System . out.print("}");
		
		//Common element in two array
		//analysis to pick array element from the frist array and check
		//against the second array elements then if it matches printout the element
		//how to do? nested for loop
		
		int[]arr1= {1,2,3}, arr2= {4,5,6,1,2};
		for (int num1:arr1) {
			for (int num2:arr2) {
				if (num1==num2) {
					System.out.println(num1);
					break;
				}
			}
		}
		
		
	}

}
