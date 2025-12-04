package Day4;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Yawaha", "001", "Pink", 2);
		Car car2 = new Car();
		
		car1.carDetails();
		car1.setBrand("Yamaha");
		System.out.println(car1.getBrand());
		
		car1.fixWheels(2);
		car1.carDetails();
		
		car2.carDetails();

	}

}
