package Day6;

public abstract class Vehicle implements Refuelable{
	private int numberOfWheels;
	private String brand;

	//Constructor??
	public Vehicle() {
		
	}
	
	public Vehicle(String brand, int numberOfWheels) {
		
	}
	

	// Generate getters
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public String getBrand() {
		return brand;
	}

	// Generate setters
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// Generate Abstract methods startEngine() and destroy()
	public void vehicleInfo() {
		System.out.println("Vehicle brand: " + this.brand);
		System.out.println("Vehicle number of wheels: " + this.numberOfWheels);
	}
	
	public void startEngine() {
	}
	
	public void destroy() {
		
	}
	
	// Call Refuel
	public void refuel() {
		
	}

	
}