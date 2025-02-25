package week06;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Player ronaldo = new Player(7, "ronaldo");
        Player messi = new Player();
        messi.setName("messi");
        messi.setJersey(10);
        
        Player neymar = new Player(0, "neymar");
        Player sinclair = new Player(0, "sinclair");

        System.out.println(ronaldo.toString());
        System.out.println(ronaldo);
        System.out.println(messi);

        ArrayList<Player> team = new ArrayList<>();
        team.add(neymar);
        team.add(messi);
        team.add(sinclair);
        team.add(ronaldo);

        System.out.println(team);

        sinclair.setJersey(12);
        // predict the output
        System.out.println(team);
    }
}