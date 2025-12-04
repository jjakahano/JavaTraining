package Day4;

public class Car {
	private String brand,model,color;
	private int wheels;
	
	public Car() {
		this.brand = "Generic";
		this.model = "000";
		this.color = "Black";
		this.wheels = 3;
	}
	
	public Car(String brand, String model, String color, int wheels) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.wheels = wheels;
	}
	
	// Getter
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	// Setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	// Methods
	public void carDetails() {
		System.out.println("Car brand is: " + this.brand);
		System.out.println("Car model is: " + this.model);
		System.out.println("Car color is: " + this.color);
		System.out.println("Car wheel count is: " + this.wheels);
		System.out.println();
	}
	
	public void fixWheels(int wheels) {
		this.wheels += wheels;
	}
}
