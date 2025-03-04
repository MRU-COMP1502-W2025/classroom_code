package week08.inheritance;

public class Vehicle {
	private String brand;
	private String motor;
	private String fuel;

	public Vehicle(String brand, String motor, String fuel) {
		this.brand = brand;
		this.motor = motor;
		this.fuel = fuel;
	}
	
	public void honk() {
		System.out.println("toot");
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMotor() {
		return this.motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getFuel() {
		return this.fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "{" +
			" brand='" + getBrand() + "'" +
			", motor='" + getMotor() + "'" +
			", fuel='" + getFuel() + "'" +
			"}";
	}	
}