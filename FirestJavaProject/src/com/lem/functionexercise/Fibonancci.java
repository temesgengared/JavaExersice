package com.lem.functionexercise;

public class Fibonancci {
	public Integer fibonacci (Integer n) {
	if (!(n instanceof Integer)) {
		return null;
	}
	if (n<=1) {
		return n;
	}
	return fibonacci (n-1)+ fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonancci fibo = new Fibonancci();
		System.out.println(fibo.fibonacci(10));
		

	}

}
