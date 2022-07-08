package com.project.wardrobeOperator;

public class Tester {
	public static void main(String[] args) {
		
	
	WardrobeOperator operator=new WardrobeOperator();
	operator.add("Top");
	operator.add("T-Shirt");
	operator.add("Kurtha");
	operator.add("Saree");
	operator.add("Pant");
	operator.add("salwan");
//	operator.add("dsgsd");
//	System.out.println(operator);
//	operator.match("Saree");
	boolean deletedThing=operator.delete(7);
	System.out.println("is data is deleted?"+deletedThing);
	System.out.println(operator);

}
}