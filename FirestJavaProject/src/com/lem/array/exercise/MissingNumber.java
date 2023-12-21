
package com.lem.array.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4};
		int max = Arrays.stream(arr)
				.max()
				.orElse(0);
		System .out.println("max"   +max);
		int sum = Arrays.stream(arr)
				    .sum();
		System .out .println("sum"  +sum);
		
		int expectedSum = 0;
		for (int i=1;i<= max;i++) {
		expectedSum +=i;
		}
		int missedNumber =expectedSum-sum;
		System.out.println("missed number"  + missedNumber);

}
	}
