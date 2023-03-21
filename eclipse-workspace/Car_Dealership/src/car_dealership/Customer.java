package car_dealership;

public class Customer {
	private String Name;
	private String Address;
	private double CashOnHand;
		
	public Customer(String name, String address, double cashOnHand) {
		super();
		Name = name;
		Address = address;
		CashOnHand = cashOnHand;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		address += "Dealership City";
		Address = address;
	}

	public double getCashOnHand() {
		return CashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		CashOnHand += 500;
		CashOnHand = cashOnHand;
	}

	public void purchasecar(Vehicle vehicle, Employee emp, boolean fianance) {
	emp.handleCustomer(this, fianance, vehicle);	
	}
}
