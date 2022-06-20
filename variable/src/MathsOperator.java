
public class MathsOperator {
public static void main(String[] args) {
	int num1=90;
	int num2;
	System.out.println("beginning number:"+num1);
	
	
	num1 +=10;
	System.out.println("after first operation:"+num1);
	
	num1 = 15 +num1;
	System.out.println("num1:"+num1);
	
	num1= 251;
	System.out.println("num1:"+num1);
	     
	num1 -= 10;
	System.out.println(num1);
	
	num1 *=2;
	System.out.println(num1);
	
	num1 /= 4;
	System.out.println(num1);
	
	num1 %= 10;
	System.out.println(num1);
	
	// increment and decrement operqation 
	
	num1= 12;
	System.out.println("num1:"+num1);
	
	num1++;
	System.out.println("Incrementing num1:"+num1);
	
	num1 = 10;
	System.out.println("num1:"+num1);
	num1--;
	System.out.println("decrementing num1:"+num1);
	
	
	
	num1 = 10;
	num2 = ++num1;
	System.out.println("preincrement num2:"+num2);
	
	num1  = 5;
	num2 = num1++;
	System.out.println("post increment num2:"+num2);
	
	
	
	
	
	
}
}
