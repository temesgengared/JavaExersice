package com.lem.array.exercise;

public class exercisepalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//analysis  collect /concat the characters from left to right and right to left 
		//then compare both and if they are equal they are palindrome
		//how to do ? to concat them we can use +or concat if there is away in java
		String  left = "" ,right ="";
		String []array= {"a","a"};
		for ( int leftCounter1 = 0, rightCounter2 =array.length-1;
				leftCounter1<= array.length-1 && rightCounter2>=1;
				leftCounter1++,rightCounter2--
				
				) {
			left =left.concat(array[leftCounter1]);
			right=right.concat(array[rightCounter2]);
		}
        if (left.equals(right)) {
        	System . out.println("this is palindrome");
        }
        
        //linear search
        // analysis compare the number with against the array elements and if ti matches then return true;
        
        int [] array1 = {1,2,5,4};
        boolean  isThere =   false;
        int numberTocheck =3;
        for (int num:array1) {
        	if (num==numberTocheck) {
        		isThere=true;
        		break;
        	}
        }
        System.out.println("isthere"    + isThere  );
	}

}
