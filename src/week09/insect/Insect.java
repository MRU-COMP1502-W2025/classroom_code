package week09.insect;

import java.util.ArrayList;

/**
 * Another class-level comment
 */
public abstract class Insect {

	private String name;
	private int pairs_of_legs;
	private ArrayList<String> parts_of_body;

	public Insect() {
		name = "";
		pairs_of_legs = 6;
		parts_of_body = new ArrayList<>();
	}

	public Insect(String name) {
		this.name = name;
	}

	public Insect(String name, boolean invertebrate, int pairs_of_legs,
			boolean compound_eyes, String skeleton, ArrayList<String> parts_of_body) {
		this.name = name;
		this.pairs_of_legs = pairs_of_legs;

		// shallow copy of ArrayList
		// this.parts_of_body = parts_of_body;

		// deep copy of ArrayList
		setPartsOfBody(parts_of_body);
		// this.parts_of_body = new ArrayList<>();
		// for (String part : parts_of_body) {
		// 	this.parts_of_body.add(new String(part));
		// }
	}

	public Insect(Insect oldInsect) {
		this.name = oldInsect.getName();
		this.pairs_of_legs = oldInsect.getPairsOfLegs();

		// shallow copy of ArrayList
		// this.parts_of_body = parts_of_body;

		// deep copy of ArrayList
		this.parts_of_body = new ArrayList<>();
		ArrayList<String> old_part_of_body = oldInsect.getPartsOfBody();

		for (String part : old_part_of_body) {
			this.parts_of_body.add(new String(part));
		}
	}

	public abstract String makeNoise();

	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPairsOfLegs() {
		return pairs_of_legs;
	}
	public void setPairsOfLegs(int pairs_of_legs) {
		this.pairs_of_legs = pairs_of_legs;
	}

	public ArrayList<String> getPartsOfBody() {
		return parts_of_body;
	}
	public void setPartsOfBody(ArrayList<String> parts_of_body) {
		this.parts_of_body = new ArrayList<>();
		for (String part : parts_of_body) {
			this.parts_of_body.add(new String(part));
		}
	}

	/**
	 * When the toString() method is called, the string that is printed to the
	 * screen
	 * would look something like:
	 * 
	 * [name]: <name> [pairs of legs]: <pairs_of_legs>\n
	 * [parts of the body]: <parts_of_body>\n
	 * 
	 */
	@Override
	public String toString() {
		String returnString = "";

		returnString += "[name]: " +getName()+ " [pairs of legs] :" +getPairsOfLegs()+ "\n";
		returnString += " [parts of the body] :" +getPartsOfBody()+ "\n";

		return returnString;

	}
}