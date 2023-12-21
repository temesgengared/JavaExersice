package com.lem.functionexercise;

public class Varargs {
	 public Integer sum (Integer...numbers) { 
			Integer sum =0;
			for (Integer number:numbers) {
				sum+=number;
			}
			return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs vararges = new Varargs();
		System.out.println(vararges.sum(1,2));
		System.out .println(vararges.sum(1,2,4,5));
		

	}

}
