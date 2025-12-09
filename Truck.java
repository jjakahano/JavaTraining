package Day6;

public class Truck extends Vehicle implements Refuelable{
		
	public Truck() {
		
	}
	
	public Truck(String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumberOfWheels(numberOfWheels);
	}
	

	
	public void startEngine() {
		System.out.println("Engine started for " + getBrand());
	}
	
	public void destroy() {
		System.out.println(getBrand() + " is destroyed!");
	}
	
	
	@Override
	public void refuel() {
		System.out.println(getBrand() + " is refueled");
	}
}
