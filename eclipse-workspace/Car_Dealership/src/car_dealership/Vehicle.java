package car_dealership;

import java.util.Objects;

public class Vehicle {
	private String make;
	private String model;
	private int price;
	
	
	public Vehicle(String make, String model, int price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(make, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model) && price == other.price;
	}
}
