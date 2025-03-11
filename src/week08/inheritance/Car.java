package week08.inheritance;

public class Car extends Vehicle  {
	private String modelName;
	private int wheels;
	
	public Car(String modelName, int wheels, String brand, String motor, String fuel) {
		super(brand, motor, fuel);
		this.modelName = modelName;
		this.wheels = wheels;
	}

	@Override
	public void honk() {
		System.out.println("beep beep");
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
        return "{" + super.toString() +
			" modelName='" + getModelName() + "'" +
			", wheels='" + getWheels() + "'" +
			"}";
	}
}