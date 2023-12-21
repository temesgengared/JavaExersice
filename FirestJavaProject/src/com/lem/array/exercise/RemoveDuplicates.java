
package com.lem.array.exercise;

import java.util.Arrays;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// analysis create new array and check if the array element
		//exist in the new array if it not write or add it 
		//if it there don't write it.
		
		Integer []arr= {1,1,3,2}, uniquearray =new Integer[arr.length];
//		int counter=0;
//		for (int j=0;j<arr.length;j++) {
//			for (int i=0;i<uniquearray.length;i++) {
//				if (arr[j]==uniquearray[i]) { 
//					counter++;
//					break;
//				}
//			}
//			if (counter==0) {
//				uniquearray[j]=arr[j];
//				
//			}
//			counter =0;
//		}
		  //improved version
				Integer[] UniquearrayUseStream =Arrays
						          .stream(arr)
						          .distinct()
						          .toArray(Integer[] ::new);
				
				for (int number:UniquearrayUseStream) {
					System .out.println(number);
		
		}

       
			}
		

	


}


