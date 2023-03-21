package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1= new Customer("Tom" , "123, Anuthing Street" , 25000);

		Vehicle vehicle = new Vehicle("BMW" , "M3" , 20000);
		 
		Employee emp = new Employee();
		cust1.purchasecar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW" , "M3" , 20000);
		boolean value = car.equals(vehicle);
		System.out.println(value);
	}

}
