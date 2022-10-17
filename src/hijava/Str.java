package hijava;

public class Str {
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Str() {}
	
	Str(String model) {
		this.model = model;
	}
	
	Str(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Str(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {
		Str car1 = new Str();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Str car2 = new Str("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Str car3 = new Str("자가용", "블랙");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Str car4 = new Str("자가용", "블랙", 300);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed " + car4.maxSpeed);
		System.out.println();
	}		
}