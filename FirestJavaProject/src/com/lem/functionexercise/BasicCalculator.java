package com.lem.functionexercise;

public class BasicCalculator {
	public Integer add(Integer a, Integer b) {
		if (a==null  ||b == null) {
			return null;
		}
	if (!(a instanceof Integer)||!(b instanceof Integer)) {
		return null;
	}
	return a+b;
		
	}
	public Integer sub(Integer a, Integer b) {
		if (a==null  ||b == null) {
			return null;
		}
	if (!(a instanceof Integer)||!(b instanceof Integer)) {
		return null;
	}
	return a-b;
		
	}
	public Integer mul(Integer a, Integer b) {
		if (a==null  ||b == null) {
			return null;
		}
	if (!(a instanceof Integer)||!(b instanceof Integer)) {
		return null;
	}
	return a*b;
		
	}
	public Integer div(Integer a, Integer b) {
		if (a==null  ||b == null || b ==0 ){
			return null;
		}
	if (!(a instanceof Integer)||!(b instanceof Integer)) {
		return null;
	}
	return a/b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// analysis  we have four task to add,div,sub and mul
		//how to solve ? using methods
		BasicCalculator  basicCalculator =new BasicCalculator();
		
		Integer addResult = basicCalculator.add(5,5);
		Integer subResult = basicCalculator.sub(10,5);
		Integer mulResult = basicCalculator.mul(5,5);
		Integer divResult = basicCalculator.div(10,5);
		
		System . out.println("additionresult " +  addResult);
		System . out.println("subtractionresult " +  subResult);
		System . out.println("multplicationresult " +  mulResult);
		System . out.println("divisionresult " +  divResult);
		

	}

}
