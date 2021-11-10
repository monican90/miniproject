package com.pojoclass;

public class Pojo_B {

	
	public static void main(String[] args) {
		
		Pojo_A pojo = new Pojo_A();
		
		int a = pojo.getA();
		
		System.out.println("value of a:"+ a);
		System.out.println("After Setter");
		pojo.setA(123456);
		
		int afterset = pojo.getA();
		System.out.println("after set value of a:"+ afterset);
	}
	
}
