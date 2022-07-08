
public class tester {
	public static void main(String[] args) {
		
		Car car = new Car("swift");
		System.out.println("Single parameterized constructor:"+car);
		
		Car car1 = new Car("Swift", "Red");
		System.out.println("Two par cons :"+car1);
//		Car car = new Car();
//				System.out.println(car);
//		Car car1 = new Car("Swift");
//		System.out.println(car1.Name);
//		
//		Car car2 = new Car("Swift","Red");
//		System.out.println(car2.Name);
//		System.out.println(car2.Color);
//		
//		Car car3 = new Car("Swift", "Red", "Maruthi");
//		System.out.println(car3.Name);
//		System.out.println(car3.Brand);
//		System.out.println(car3.Color);
	}

}

