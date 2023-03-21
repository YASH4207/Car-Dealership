package car_dealership;

public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if(finance == true) {
			double loanAmmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmmount);
		}else if(vehicle.getPrice()<=cust.getCashOnHand()) {
			//Customer pays in cash
			processTransaction(cust , vehicle);
		}else {
			System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmmount){
		System.out.println ("Ran credit history for customer........");
		System.out.println("Customer has been aprooved to purchase the vehicle");
		
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System .out.println("Customer has purchased vehicle: " + vehicle + " for the price " + vehicle.getPrice());
	}
}
