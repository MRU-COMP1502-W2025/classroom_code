package week08.insect;

/**
 * This is a class-level Javadoc comment
 */
public class FlyingInsect extends Insect {
	private int wings;

	/**
	 * This is a method-level Javadoc comment
	 */
	public void setWings(int wings) {
		this.wings = wings;
	}

	/**
	 * This is a method-level Javadoc comment
	 */
	public int getWings() {
		return wings;
	}

	/**
	 * When objects of this class are output, this class's 
	 * instance variables will be added to the end of 
	 * the parent's toString() method after the text '[Flying Insect]'
	 * is added at the beginning.
	 * 
	 * [Flying Insect]<br>
	 * 
	 * <super>.toString()
	 * 
	 * [wings]: <wings> 
	 */
	@Override
	public String toString() {
		String returnString = "";
		returnString += "[Flying Insect]\n";
		returnString += super.toString();

		returnString += "[wings]: " + getWings();

		return returnString;
	}	
}