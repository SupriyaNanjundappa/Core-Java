package com.project.BusApp;

public class staticDemo {
	static int a = 100;
	static int b = 50;
	static int sum = a+b;
	static int sub = a-b;
	static int mul = a*b;
	static int div = a/b;
	
	public static void main(String[] args) {
		System.out.println("Addition of two number:"+sum);
		System.out.println("Substraction of two number:"+staticDemo.sub);
		System.out.println("multiplication of two number:"+staticDemo.mul);
		System.out.println("Division of two number:"+staticDemo.div);
	}

}
