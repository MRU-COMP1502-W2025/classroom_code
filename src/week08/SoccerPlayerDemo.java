package week08;

import week08.inheritance.SoccerPlayer;
import week08.inheritance.SoccerPlayerGoalie;

public class SoccerPlayerDemo {
	public static void main(String[] args) {
		System.out.println("--------");

		SoccerPlayer david = new SoccerPlayer(10, "Jonathan David");
		System.out.println(david);
		david.shoot();

		SoccerPlayer alphonso = new SoccerPlayer(19, "Alphonso Davies");
		System.out.println(alphonso);
		alphonso.shoot();

		// (int jersey, String name, String jerseryColour, boolean canCatch) {
		SoccerPlayerGoalie crepeau = new SoccerPlayerGoalie(1, "Max Crepeau", "yellow", true);
	

		if  (crepeau instanceof SoccerPlayerGoalie) {
			System.out.println("SoccerPlayerGoalie: " + crepeau);
		
		} 
		
		if (crepeau instanceof SoccerPlayer) {
			System.out.println("SoccerPlayer: " + crepeau);
		}
		crepeau.shoot(5);

	}
}