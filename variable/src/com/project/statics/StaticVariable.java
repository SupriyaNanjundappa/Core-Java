package com.project.statics;

public class StaticVariable {
	static int a=  100;
	static  int  b =50;
	static int add= a+b;
	static int sub = a-b;
	static int mul=a*b;
	
	public static void main(String[] args) {
		System.out.println("addition of number:"+StaticVariable.add);
		System.out.println(StaticVariable.sub);
	}
	
	
}
