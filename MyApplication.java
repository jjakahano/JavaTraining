package Day6;

public class MyApplication {
	
	public static void main(String[] args) {
		
		Car car = new Car("Yamaha", 4);
		Truck truck = new Truck("Sarao", 10);
		
		car.vehicleInfo();
		car.startEngine();
		car.refuel();
		destroyVehicle(car);
		
		System.out.println();
		
		truck.vehicleInfo();
		truck.startEngine();
		truck.refuel();
		destroyVehicle(truck);
	}
	
	public static void destroyVehicle(Vehicle name) {
		name.destroy();
	}

}
