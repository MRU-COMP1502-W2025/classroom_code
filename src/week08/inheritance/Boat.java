package week08.inheritance;

public class Boat extends Vehicle {
    private int propellors;

    public Boat(int propellors, String brand, String motor, String fuel) {
        super(brand, motor, fuel);
        this.propellors = propellors;
    }

    public int getPropellors() {
        return this.propellors;
    }
    public void setPropellors(int propellors) {
        this.propellors = propellors;
    }


    @Override
	public void honk() {
        System.out.println("whhhhhaaaaaooooowww");
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
            " propellors='" + getPropellors() + "'" +
            "}";
    }
}