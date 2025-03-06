package week08.inheritance;

public class SoccerPlayerGoalie extends SoccerPlayer {
    private String jerseryColour;
    private boolean canCatch;

    // constructors
    public SoccerPlayerGoalie() { 
        this("black", true);
    }
    public SoccerPlayerGoalie(String jerseryColour, boolean canCatch) {
        super(0, "");

        this.jerseryColour = jerseryColour;
        this.canCatch = canCatch;
    }
    public SoccerPlayerGoalie(int jersey, String name, String jerseryColour, boolean canCatch) {
        super(jersey, name);

        super.setHeight(100);
        super.setPosition("goalie");

        this.jerseryColour = jerseryColour;
        this.canCatch = canCatch;
    }

    // getters and setters
    public String getJerseryColour() {
        return jerseryColour;
    }
    public void setJerseryColour(String jerseryColour) {
        this.jerseryColour = jerseryColour;
    }
    public boolean getCanCatch() {
        return canCatch;
    }
    public void setCanCatch(boolean canCatch) {
        this.canCatch = canCatch;
    }
    
    @Override
    public void shoot() {
        System.out.println("booooom");
    }

    
    public void shoot(int power) {
        for(int i=0; i < power; ++i) {
            System.out.println("booooom");
        }
    }

    // overriding methods
    @Override
    public String toString() {
        String returnString = super.toString();
        returnString += " jersey colour: " +getJerseryColour();

        return returnString;
    }


}