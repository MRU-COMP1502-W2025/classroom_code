package week09.insect;

/**
 * 
 */
public class StingingInsect extends Insect {

	private boolean isLethal;


	public boolean getIsLethal() {
		return isLethal;
	}


	public void setIsLethal(boolean isLethal) {
		this.isLethal = isLethal;
	}

	/**
	 * When objects of this class are output, this class's 
	 * instance variables will be added to the end of 
	 * the parent's toString() method after the text '[Stinging Insect]'
	 * is added at the beginning.
	 * 
	 * [Stinging Insect]
	 * 
	 * <super>.toString()
	 * 
	 * [lethal stinger]: <isLethal> 
	 */
	@Override
	public String toString() {
		String returnString = "";

		returnString += "[Stinging Insect]";
		returnString += super.toString();
		returnString += "[lethal stinger]: " +getIsLethal();

		return returnString;
	}
}