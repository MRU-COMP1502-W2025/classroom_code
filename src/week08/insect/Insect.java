package week08.insect;

import java.util.ArrayList;

/**
 * Another class-level comment
 */
public class Insect {

	private String name;
	private boolean invertebrate;
	private int pairs_of_legs;
	private boolean compound_eyes;
	private String skeleton;
	private ArrayList<String> parts_of_body;

	/**
	 * 0 parameter default constructor
	 */
	public Insect() {
		this("");
	}

	/**
	 * One parameter constructor
	 * @param name - the name of the insect
	 */
	public Insect(String name) {
		this.name = name;
		invertebrate = true;
		pairs_of_legs = 6;
		compound_eyes = true;
		skeleton = "exoskeleton";
		parts_of_body = new ArrayList<>();
	}

	/**
	 * Deep copy constructor for an insect with 6-parameters provided
	 * 
	 * @param name - the name of the insect
	 * @param invertebrate - <code>true</code> if invertebrate, <code>false</code> otherwise
	 * @param pairs_of_legs - number of legs
	 * @param compound_eyes - <code>true</code> if the insect has compound eyes, <code>false</code> otherwise
	 * @param skeleton - type of skeleton
	 * @param parts_of_body - the names of the different parts of the body
	 */ 
	public Insect(String name, boolean invertebrate, int pairs_of_legs,
			boolean compound_eyes, String skeleton, ArrayList<String> parts_of_body) {
		this.name = name;
		this.invertebrate = invertebrate;
		this.pairs_of_legs = pairs_of_legs;
		this.compound_eyes = compound_eyes;
		this.skeleton = skeleton;

		// shallow copy of ArrayList
		// this.parts_of_body = parts_of_body;

		// deep copy of ArrayList
		setPartsOfBody(parts_of_body);
		// this.parts_of_body = new ArrayList<>();
		// for (String part : parts_of_body) {
		// 	this.parts_of_body.add(new String(part));
		// }
	}

	/**
	 * Deep copy constructor from an existing object of type Insect
	 */
	public Insect(Insect oldInsect) {
		this.name = oldInsect.getName();
		this.invertebrate = oldInsect.getInvertebrate();
		this.pairs_of_legs = oldInsect.getPairsOfLegs();
		this.compound_eyes = oldInsect.getCompoundEyes();
		this.skeleton = oldInsect.getSkeleton();

		// shallow copy of ArrayList
		// this.parts_of_body = parts_of_body;

		// deep copy of ArrayList
		this.parts_of_body = new ArrayList<>();
		ArrayList<String> old_part_of_body = oldInsect.getPartsOfBody();

		for (String part : old_part_of_body) {
			this.parts_of_body.add(new String(part));
		}
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getInvertebrate() {
		return invertebrate;
	}

	public void setInvertebrate(boolean invertebrate) {
		this.invertebrate = invertebrate;
	}

	public int getPairsOfLegs() {
		return pairs_of_legs;
	}

	public void setPairsOfLegs(int pairs_of_legs) {
		this.pairs_of_legs = pairs_of_legs;
	}

	public boolean getCompoundEyes() {
		return compound_eyes;
	}

	public void setCompoundEyes(boolean compound_eyes) {
		this.compound_eyes = compound_eyes;
	}

	public String getSkeleton() {
		return skeleton;
	}

	void setSkeleton(String skeleton) {
		this.skeleton = skeleton;
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
	 * [skeleton]: <skeleton> [parts of the body]: <parts_of_body>\n
	 * 
	 */
	@Override
	public String toString() {
		String returnString = "";

		returnString += "[name]: " +getName()+ " [pairs of legs] :" +getPairsOfLegs()+ "\n";
		returnString += "[skeleton]: " +getSkeleton()+ " [parts of the body] :" +getPartsOfBody()+ "\n";

		return returnString;

	}

	public boolean equals(Insect other) {

		if(this.getName().equals(other.getName() )) {
			return true;
		} else {
			return false;
		}
	}
}