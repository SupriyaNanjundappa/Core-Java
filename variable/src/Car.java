
public class Car {
	String Name;
	String Color;
	String Brand;
	double price;
	
	public Car() {
		
	}
	
	public Car(String name) {
		super();
		Name = name;
	}

	public Car(String name, String color) {
		super();
		Name = name;
		Color = color;
	}

	public Car(String name, String color, String brand) {
		super();
		Name = name;
		Color = color;
		Brand = brand;
	}

	public Car(String name, String color, String brand, double price) {
		super();
		Name = name;
		Color = color;
		Brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [Name=" + Name + ", Color=" + Color + ", Brand=" + Brand + ", price=" + price + "]";
	}
	
	
	
	
}
